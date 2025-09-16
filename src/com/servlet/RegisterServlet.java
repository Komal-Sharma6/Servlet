package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Welcome to register services");
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String condition = request.getParameter("condition");

        if(condition.equals("checked")){
            out.println("<h2> name: "+name+"</h2>");
            out.println("<h2> password: "+password+"</h2>");
            out.println("<h2> gender: "+gender+"</h2>");
            out.println("<h2> course: "+course+"</h2>");

        }else{
            System.out.println("You did not agree to the terms and conditions");
        }

    }

}
