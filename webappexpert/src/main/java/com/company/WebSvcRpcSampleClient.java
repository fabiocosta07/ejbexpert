package com.company;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

/**
 * Created by efabapo on 15/11/17.
 */
// example 111-3
public class WebSvcRpcSampleClient {
    public static void main(String [] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/websvcrpcsample?wsdl");
        QName qName = new QName("http://company.com/","WebSvcRpcSampleImplService");
        Service service = Service.create(url,qName);
        WebSvcRpcSample webSvcRpcSample = service.getPort(WebSvcRpcSample.class);
        System.out.println(webSvcRpcSample.testRpc("XXX"));

    }
}
