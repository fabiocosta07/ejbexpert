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
        }, mappedName = "jms/SampleQueue3")
@TransactionManagement(TransactionManagementType.BEAN)
public class MdbSampleQueue3 implements MessageListener{

    @Resource
    MessageDrivenContext messageDrivenContext;

    @EJB
    Singleton1 singleton1;

    @Override
    public void onMessage(Message message) {
        try {
            messageDrivenContext.getUserTransaction().begin();

            if (singleton1.getCountRedelivery3() < 1){
                singleton1.addCountreRelivery3();
                System.out.println("MdbSampleQueue3 Message Redelivered times:"+singleton1.getCountRedelivery3());
                throw new RuntimeException("RRuntimeExxcetion");
            } else {
                try {
                    System.out.println("Message Consumed" + ((TextMessage)message).getText());
                    messageDrivenContext.getUserTransaction().commit();
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        } catch (NotSupportedException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        } catch (HeuristicMixedException e) {
            e.printStackTrace();
        } catch (HeuristicRollbackException e) {
            e.printStackTrace();
        } catch (RollbackException e) {
            e.printStackTrace();
        }
    }
}
