package com.company;

import javax.ejb.Remote;

/**
 * Created by efabapo on 16/11/17.
 */
// example 113-1
@Remote
public interface EjbRemote2 {
    public String testMethod2(String arg0);
}
