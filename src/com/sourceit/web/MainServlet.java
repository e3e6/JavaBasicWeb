package com.sourceit.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
 
public class MainServlet extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
 
        PrintWriter out = resp.getWriter();
        out.print("<h1>Hello Servlet</h1>");
        out.print("<p>");
        out.print(new Date());
        out.print("</p>");
 
    }
 
}