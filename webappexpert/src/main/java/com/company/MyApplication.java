package com.company;

import com.company.rest.Rest1;
import com.company.rest.Rest2;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by efabapo on 22/11/17.
 */
@ApplicationPath("/")
public class MyApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        HashSet h = new HashSet<Class<?>>();
        h.add( Rest1.class );
        h.add( Rest2.class );
        return h;
    }
}
