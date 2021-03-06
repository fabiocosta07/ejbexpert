package com.company;

import com.company.rest.*;

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
        h.add( Rest3.class );
        h.add( Rest4.class );
        h.add( Rest5.class );
        h.add( Rest6.class );
        h.add( Rest7.class );
        h.add( Rest8.class );
        h.add( Rest9.class );
        h.add( Rest10.class );
        h.add( Rest11.class );
        return h;
    }
}
