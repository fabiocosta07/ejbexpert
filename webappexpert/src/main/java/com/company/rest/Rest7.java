package com.company.rest;

import com.company.EjbLocal3;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by efabapo on 16/11/17.
 */
// example 236
@ManagedBean
@Path("/rest/rest7")
public class Rest7 {

    @EJB
    EjbLocal3 ejbLocal3;

    @GET
    @Produces("text/html")
    public String rest() throws JMSException {
        ejbLocal3.testMethod3("test3");
        ejbLocal3.remove();
        return "Removed";
    }

}
