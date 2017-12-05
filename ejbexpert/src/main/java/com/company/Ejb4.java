package com.company;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 * Created by efabapo on 04/12/17.
 */
// example 521-1
@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class Ejb4 {
    @Resource
    UserTransaction userTransaction;

    public String testMethod4(String arg1){
        try {
            userTransaction.begin();
        } catch (NotSupportedException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        }
        System.out.println("TestMethod4:"+arg1);
        return arg1;
    }
}
