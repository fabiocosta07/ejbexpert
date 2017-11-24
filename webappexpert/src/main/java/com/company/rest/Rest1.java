package com.company.rest;

import com.company.EjbLocal1;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by efabapo on 16/11/17.
 */
@Path("/rest/rest1")
public class Rest1 {

    @EJB
    private EjbLocal1 ejb1;

    @GET
    @Produces("text/html")
    public String rest(){
        return ejb1.testEjbMethod1();
    }
}
