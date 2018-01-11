package com.company;

import com.company.interceptors.InterceptorTimeout1;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.*;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;

/**
 * Created by efabapo on 10/01/18.
 */
// example 45
@Singleton
@Startup
@Interceptors(InterceptorTimeout1.class)
public class Ejb7 {

    @Resource
    TimerService timerService;
    @PostConstruct
    public void initialization(){
        System.out.println("Ejb7 Initialization");
        timerService.createIntervalTimer(30,30,new TimerConfig());
    }

    @Timeout
    public void test(Timer timer){
        System.out.println("Ejb7 Timeout");
    }
}
