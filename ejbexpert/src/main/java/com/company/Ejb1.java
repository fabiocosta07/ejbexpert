package com.company;

import javax.ejb.Stateless;

/**
 * Created by efabapo on 14/11/17.
 */
@Stateless
public class Ejb1 {
    public String testEjbMethod1(){
        return "testEjbMethod1";
    }
}
