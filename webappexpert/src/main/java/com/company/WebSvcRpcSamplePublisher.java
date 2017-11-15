package com.company;

import javax.xml.ws.Endpoint;

/**
 * Created by efabapo on 15/11/17.
 */
public class WebSvcRpcSamplePublisher {
    public static void main(String [] args){
        Endpoint.publish("http://localhost:9999/ws/websvcrpcsample", new WebSvcRpcSampleImpl());
    }
}
