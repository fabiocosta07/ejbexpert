package com.company.servlet;

import com.company.EjbLocal1;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by efabapo on 24/11/17.
 */
// example 215-1
@WebServlet("/webServlet1")
public class WebServlet1 extends HttpServlet {


    @EJB
    private EjbLocal1 ejbLocal1;

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.getOutputStream().print("<br>"+ejbLocal1.testEjbMethod1()+"</br>");
    }
}
