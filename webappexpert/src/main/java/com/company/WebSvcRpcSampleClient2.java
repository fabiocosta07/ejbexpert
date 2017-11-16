package com.company;

import com.company.wsimport.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by efabapo on 15/11/17.
 */
// examples 111-5
public class WebSvcRpcSampleClient2 {
    public static void main(String [] args) throws Exception {
        WebSvcRpcSampleImplService webSvcRpcSampleImplService = new WebSvcRpcSampleImplService();
        com.company.wsimport.WebSvcRpcSample webSvcRpcSample = webSvcRpcSampleImplService.getWebSvcRpcSampleImplPort();
        System.out.println(webSvcRpcSample.testRpc("XXX"));

    }
}
