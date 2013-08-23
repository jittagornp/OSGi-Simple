/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.osgi.web;

import com.blogspot.na5cent.osgi.service.api.HelloWorldService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.glassfish.osgicdi.OSGiService;

/**
 *
 * @author jittagornp
 */
@WebServlet(urlPatterns = "/helloWorld")
public class HelloWorldServlet extends HttpServlet {

    @Inject
    @OSGiService(dynamic = true)
    private HelloWorldService helloWorldService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = null;
        try{
            writer = response.getWriter();
            writer.println(helloWorldService.sayHelloWorld());
            writer.println("session : " + request.getSession().getId());
        }finally{
            if(writer != null){
                writer.close();
            }
        }
    }
}
