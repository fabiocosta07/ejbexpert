package com.company;

import javax.annotation.Resource;
import javax.ejb.*;
import java.util.concurrent.Future;

/**
 * Created by efabapo on 14/11/17.
 */
// example 111-1
// example 111-2
// example 112-1
@Stateless
public class Ejb1 implements EjbLocal1{
    public String testEjbMethod1(){
        return "testEjbMethod1";
    }
    // example 218-1
    @Resource
    SessionContext myContext;

    @Asynchronous
    public Future<Integer> performAddition(Integer a, Integer b) {
        if (!myContext.wasCancelCalled()){
            final String s = null;
            final String s1 = s.toString();
            Integer result = a + b;
            return new AsyncResult<Integer>(result);
        }
        return new AsyncResult<Integer>(0);
    }
}
