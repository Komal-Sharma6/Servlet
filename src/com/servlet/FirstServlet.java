package com.servlet;


import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class FirstServlet implements Servlet {

    ServletConfig conf;

    @Override
    public void init(ServletConfig conf)  {
        this.conf=conf;
       System.out.println("Creating objects.....");
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
       System.out.println("Servicing....");
       resp.setContentType("text/html");
       PrintWriter out =resp.getWriter();
       out.println("<h1>This is response of my servlet</h1>");
        out.println("<h1>Today's date is "+new Date().toString()+" </h1>");

    }

    @Override
    public void destroy() {
        System.out.println("Destroying servlet object");
    }

    public ServletConfig getServletConfig() {
     return this.conf;
    }
    public String getServletInfo(){
        return "This servlet is created by Komal Sharma";
    }
}
