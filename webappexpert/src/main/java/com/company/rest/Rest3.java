package com.company.rest;

import com.company.EjbLocal1;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by efabapo on 16/11/17.
 */
// example 31
@ManagedBean
@Path("/rest/rest3")
public class Rest3 {

    @Resource(mappedName = "jms/SampleQueue")
    Queue queue;

    @Resource(mappedName = "jms/QueueConnectionFactory")
    QueueConnectionFactory queueConnectionFactory;

    @GET
    @Produces("text/html")
    public String rest() throws JMSException {

        Connection connection = queueConnectionFactory.createConnection();
        Session session = connection.createSession(true, 0);
        MessageProducer producer = session.createProducer(queue);
        TextMessage msg = session.createTextMessage("Tests");
        producer.send(msg);
        return "Sent";
    }

}
