package com.company;

import javax.ejb.Asynchronous;
import javax.ejb.Local;
import java.util.concurrent.Future;

/**
 * Created by efabapo on 22/11/17.
 */
@Local
public interface EjbLocal1 {
    public String testEjbMethod1();
    //218-1
    public Future<Integer> performAddition(Integer a, Integer b);
}
