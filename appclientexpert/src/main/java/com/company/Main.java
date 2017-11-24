package com.company;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

/**
 * Created by efabapo on 30/10/17.
 */
//example 113-1
public class Main {

    private void connect() {
        try{
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

            InitialContext ctx = new InitialContext();
            EjbRemote2 ejbRemote2 = (EjbRemote2) ctx.lookup("java:global/ejbexpert/Ejb2!com.company.EjbRemote2");
            String ret = ejbRemote2.testMethod2("appclient");
            System.out.println(ret);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main tejbc = new Main();
        tejbc.connect();
    }
}
