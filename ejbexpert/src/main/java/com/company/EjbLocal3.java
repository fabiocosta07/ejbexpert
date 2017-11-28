package com.company;

import javax.ejb.Local;

/**
 * Created by efabapo on 28/11/17.
 */
@Local
public interface EjbLocal3 {
    public String testMethod3(String arg1);
    public void remove();
}
