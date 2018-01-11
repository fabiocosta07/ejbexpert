package com.company.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Created by efabapo on 10/01/18.
 */
// example 44
@Interceptor
public class Interceptor1 {
    @AroundInvoke
    public Object methodLogger(final InvocationContext ctx) throws Exception {
        System.out.println("Inside Interceptor 1");
        return ctx.proceed();
    }
}
