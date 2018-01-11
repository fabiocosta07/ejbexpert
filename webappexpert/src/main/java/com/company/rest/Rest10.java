package com.company.rest;

import com.company.Ejb5;
import com.company.Ejb6;
import com.company.Ejb7;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by efabapo on 16/11/17.
 */
// example 44
@ManagedBean
@Path("/rest/rest10")
public class Rest10 {

    @EJB
    Ejb6 ejb6;


    @GET
    @Produces("text/html")
    public String rest() {
        String str = ejb6.test("test6");
        return str;
    }

}
