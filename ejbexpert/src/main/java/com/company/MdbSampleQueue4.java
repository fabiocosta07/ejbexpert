package com.company;

import javax.annotation.Resource;
import javax.ejb.*;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.transaction.*;

/**
 * Created by efabapo on 27/11/17.
 */
// example 3102
@MessageDriven( activationConfig =
        { @ActivationConfigProperty( propertyName = "destinationType",
                propertyValue = "javax.jms.Queue"
        )
        }, mappedName = "jms/SampleQueue4")
@TransactionManagement(TransactionManagementType.CONTAINER)
public class MdbSampleQueue4 implements MessageListener{

    @EJB
    Singleton1 singleton1;

    @Override
    public void onMessage(Message message) {
            if (singleton1.getCountRedelivery4() < 1){
                singleton1.addCountreRelivery4();
                System.out.println("MdbSampleQueue4 Message Redelivered times:"+singleton1.getCountRedelivery4());
                throw new RuntimeException("RRuntimeExxcetion");
            } else {
                try {
                    System.out.println("Message Consumed" + ((TextMessage)message).getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
    }
}
