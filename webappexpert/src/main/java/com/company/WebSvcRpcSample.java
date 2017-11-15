package com.company;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by efabapo on 15/11/17.
 */
// example 111
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WebSvcRpcSample {
    @WebMethod
    String testRpc(String name);
}
