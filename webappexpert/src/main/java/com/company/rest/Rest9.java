package com.company.rest;

import com.company.Ejb4;
import com.company.Ejb5;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by efabapo on 16/11/17.
 */
// example 521-2
@ManagedBean
@Path("/rest/rest9")
public class Rest9 {

    @EJB
    Ejb5 ejb5;

    @GET
    @Produces("text/html")
    public String rest() throws JMSException {
        String str = ejb5.testMethod5("test5");
        return str;
    }

}
