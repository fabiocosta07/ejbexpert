package com.company;

import com.company.interceptors.Interceptor1;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

/**
 * Created by efabapo on 10/01/18.
 */
// example 44
@Stateless
@Interceptors(Interceptor1.class)
public class Ejb6 {
    public String test(String str){
        return "teste";
    }
}
