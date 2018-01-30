package com.company;

import javax.ejb.Singleton;

/**
 * Created by efabapo on 28/11/17.
 */
// example 31
@Singleton
public class Singleton1 {
    private int countRedelivery;

    public int getCountRedelivery() {
        return countRedelivery;
    }

    public void addCountreRelivery(){
        countRedelivery++;
    }
    // example 3101
    private int countRedelivery2;

    public int getCountRedelivery2() {
        return countRedelivery2;
    }

    public void addCountreRelivery2(){
        countRedelivery2++;
    }

    // example 3102
    private int countRedelivery3;

    public int getCountRedelivery3() {
        return countRedelivery3;
    }

    public void addCountreRelivery3(){
        countRedelivery3++;
    }

    // example 3103
    private int countRedelivery4;

    public int getCountRedelivery4() {
        return countRedelivery4;
    }

    public void addCountreRelivery4(){
        countRedelivery4++;
    }
}
