package com.company;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

/**
 * Created by efabapo on 1/23/17.
 */
// example 111-1
@WebService
public class WebSvcWsSample {

    @EJB
    private Ejb1 ejb1;

    @Resource
    WebServiceContext webServiceContext;

    @WebMethod(operationName = "hello")
    public String hello(){
        // example - 111-6
        MessageContext messageContext = webServiceContext.getMessageContext();
        System.out.println("MessageContext size:"+messageContext.size());
        return ejb1.testEjbMethod1();
    }
}
