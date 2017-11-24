package com.company.rest;

import com.company.EjbLocal1;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.ejb.EJBContext;
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
// example 218-1
@Path("/rest/rest2")
public class Rest2 {

    @GET
    @Produces("text/html")
    public String rest(){
        try {
            Context context = new InitialContext();
            EjbLocal1 ejbLocal1 = (EjbLocal1) context.lookup("java:global/earexpert/ejbexpert-1.0-SNAPSHOT/Ejb1");

            Future<Integer> fi = ejbLocal1.performAddition(1,4);
            fi.cancel(true);
            try {
                return fi.get().toString();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                System.out.println("Excetion Exception - cause:" + e.getCause());
            }
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return "";

    }

}
