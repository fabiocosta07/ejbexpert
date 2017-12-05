package com.company.rest;

import com.company.Ejb3;
import com.company.Ejb4;
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
// example 521-1
@ManagedBean
@Path("/rest/rest8")
public class Rest8 {

    @EJB
    Ejb4 ejb4;

    @GET
    @Produces("text/html")
    public String rest() throws JMSException {
        String str = ejb4.testMethod4("test4");
        return str;
    }

}
