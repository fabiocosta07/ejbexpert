package com.company;

import javax.annotation.Resource;
import javax.ejb.Stateful;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 * Created by efabapo on 04/12/17.
 */
// example 521-2
@Stateful
@TransactionManagement(TransactionManagementType.BEAN)
public class Ejb5 {

    @Resource
    UserTransaction userTransaction;

    public String testMethod5(String arg1){
        try {
            userTransaction.begin();
        } catch (NotSupportedException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        }
        return arg1;
    }
}
