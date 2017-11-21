
package com.company.wsimport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
// example 111-5
@WebService(name = "WebSvcRpcSample", targetNamespace = "http://company.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WebSvcRpcSample {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://company.com/WebSvcRpcSample/testRpcRequest", output = "http://company.com/WebSvcRpcSample/testRpcResponse")
    public String testRpc(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}