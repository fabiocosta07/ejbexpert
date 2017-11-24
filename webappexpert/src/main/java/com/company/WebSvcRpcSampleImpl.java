package com.company;

import javax.ejb.EJB;
import javax.jws.WebService;

/**
 * Created by efabapo on 15/11/17.
 */
// example 111-2
@WebService(endpointInterface = "com.company.WebSvcRpcSample")
public class WebSvcRpcSampleImpl implements WebSvcRpcSample {

    @EJB
    private EjbLocal1 ejb1;

    // @Resource
    // SessionContext sessionContext;

    @Override
    public String testRpc(String name) {
        // example 111-7
        // MessageContext messageContext = sessionContext.getMessageContext();
        return "Hello "+ ejb1.testEjbMethod1();
    }
}
