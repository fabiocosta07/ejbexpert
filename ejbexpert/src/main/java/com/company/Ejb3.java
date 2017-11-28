package com.company;

import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 * Created by efabapo on 28/11/17.
 */
// example 234
@Stateful
public class Ejb3 implements EjbLocal3 {
    @Override
    public String testMethod3(String arg1) {
        return "TestMethod3"+arg1;
    }

    @PrePassivate
    public void prePassivate(){
        System.out.println("Test PrePassivate");
    }
    @PostActivate
    public void postActivate(){
        System.out.println("Test PostActivate");
    }

    // example 236
    @Remove
    @Override
    public void remove(){
        System.out.println("Test Remove");
    }
}
