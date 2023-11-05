package com.phoenix.javajsp.servlet;

import javax.servlet.http.*;
import java.io.IOException;

public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest  request, HttpServletResponse response) throws IOException{

//        int k = (int) request.getAttribute("square");
//        Comment the above line when working on redirects
//        int k = Integer.parseInt(request.getParameter("square"));

//        Comment the above line for session management
        HttpSession httpSession = request.getSession();
//        int k = (int) httpSession.getAttribute("square"); // use this for session management

        //Example: Session management is used for login information, to check user info
        int k = 0;
        // Cookie
        Cookie cookies[] = request.getCookies();
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("square")){
                k = Integer.parseInt(cookie.getValue());
            }
        }

        response.getWriter().println("Hello from square servlet with result as " + k);
    }
}