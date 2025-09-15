package com.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class ThirdServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        System.out.println("This is doGet method of servlet created by extending HttpServlet");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("This is third servlet created by extending HttpServlet class. We are using doGet method.");
    }

}
