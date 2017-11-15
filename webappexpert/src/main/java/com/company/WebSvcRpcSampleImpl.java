package com.company;

import javax.jws.WebService;

/**
 * Created by efabapo on 15/11/17.
 */
@WebService(endpointInterface = "com.company.WebSvcRpcSample")
public class WebSvcRpcSampleImpl implements WebSvcRpcSample {
    @Override
    public String testRpc(String name) {
        return "Hello "+ name;
    }
}
