package com.phoenix.javajsp.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddNumberServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int i = Integer.parseInt(request.getParameter("number1"));
        int j = Integer.parseInt(request.getParameter("number2"));
        int k = i + j;
        int p = k * k;
        request.setAttribute("square", p);
        response.getWriter().println(k);
             // Called Square servelet from Add Servlet
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("square");
//        requestDispatcher.forward(request,response);

        // Comment the above 2 lines to work with redirection

//        response.sendRedirect("square?square="+ p); // use this for redirection

        // Use of Session Management
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("square", p);
//        response.sendRedirect("square"); // Use this for session management

        // Cookie
        Cookie cookie = new Cookie("square", p+"");
        response.addCookie(cookie);
        response.sendRedirect("square");
    }

}
