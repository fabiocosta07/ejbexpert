package com.company.rest;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.jms.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by efabapo on 16/11/17.
 */
// example 3101
@ManagedBean
@Path("/rest/rest4")
public class Rest4 {

    @Resource(mappedName = "jms/SampleQueue2")
    Queue queue;

    @Resource(mappedName = "jms/QueueConnectionFactory")
    QueueConnectionFactory queueConnectionFactory;

    @GET
    @Produces("text/html")
    public String rest() throws JMSException {

        Connection connection = queueConnectionFactory.createConnection();
        Session session = connection.createSession(true, 0);
        MessageProducer producer = session.createProducer(queue);
        TextMessage msg = session.createTextMessage("Test Queue2");
        producer.send(msg);
        return "Sent";
    }

}
