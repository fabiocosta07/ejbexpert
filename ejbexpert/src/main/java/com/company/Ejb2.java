package com.company;

import javax.ejb.Stateless;

/**
 * Created by efabapo on 16/11/17.
 */
// example 111-9
@Stateless
public class Ejb2 implements EjbRemote2 {
    @Override
    public String testMethod2(String arg0) {
        return "Hello" + arg0;
    }
}
