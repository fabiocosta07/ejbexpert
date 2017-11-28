package com.company;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by efabapo on 27/11/17.
 */
// example 31
@MessageDriven( activationConfig =
        { @ActivationConfigProperty( propertyName = "destinationType",
                propertyValue = "javax.jms.Queue"
        )
        }, mappedName = "jms/SampleQueue")
public class MdbSampleQueue implements MessageListener{

    @Resource
    MessageDrivenContext messageDrivenContext;

    @EJB
    Singleton1 singleton1;

    @Override
    public void onMessage(Message message) {
        if (singleton1.getCountRedelivery() < 3){
            singleton1.addCountreRelivery();
            System.out.println("RRRRRR Message Redelivered times:"+singleton1.getCountRedelivery());
            messageDrivenContext.setRollbackOnly();
        } else {
            try {
                System.out.println("XXXXXXXXXXX" + ((TextMessage)message).getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
