package com.company.interceptors;

import javax.interceptor.AroundTimeout;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Created by efabapo on 10/01/18.
 */
// example 45
@Interceptor
public class InterceptorTimeout1 {
    @AroundTimeout
    public Object methodLoggerTimeout(InvocationContext ctx) throws Exception{
        System.out.println("Inside InterceptorTimeout1");
        return ctx.proceed();
    }
}
