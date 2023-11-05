package com.phoenix.javajsp.servletcontext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class NewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("This is a servlet context");

//        ServletContext ctx = getServletContext(); // Uncomment for servlet context
//        String str = ctx.getInitParameter("name");
        ServletConfig cg = getServletConfig();
        String str = cg.getInitParameter("name");
        printWriter.println(str);
    }
}
