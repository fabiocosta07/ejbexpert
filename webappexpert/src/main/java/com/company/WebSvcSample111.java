package com.company;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by efabapo on 1/23/17.
 */
// example - 1.1.1
@WebService
public class WebSvcSample111 {

    @EJB
    private Ejb1 ejb1;
    @WebMethod(operationName = "hello")
    public String hello(){
        return ejb1.testEjbMethod1();
    }
}
