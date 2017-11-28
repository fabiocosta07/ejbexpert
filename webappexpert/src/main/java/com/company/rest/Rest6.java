package com.company.rest;

import com.company.EjbLocal3;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.jms.JMSException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by efabapo on 16/11/17.
 */
// example 234
@ManagedBean
@Path("/rest/rest6")
public class Rest6 {

    @EJB
    EjbLocal3 ejbLocal3First;

    @GET
    @Produces("text/html")
    public String rest() throws JMSException {
        try {
            Context context = new InitialContext();
            EjbLocal3 ejbLocal3;
            for (int i =0; i < 10; i++){
                ejbLocal3 = (EjbLocal3) context.lookup("java:global/earexpert/ejbexpert-1.0-SNAPSHOT/Ejb3");
            }
            ejbLocal3First.testMethod3("Teste3");

        } catch (NamingException e) {
            e.printStackTrace();
        }
        return "Call" + ejbLocal3First.testMethod3("test3");
    }

}
