package com.java.jsp.web;

import com.java.jsp.dao.UserRepository;
import com.java.jsp.model.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/user")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    UserRepository userRepository;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getServletPath();

        try {
            switch (action) {
                case "/dologin":
                    loginUser(request, response);
                    break;
                case "/list":
                    listUser(request, response);
                    break;
                case "/new":
                    showNewForm(request, response);
                    break;
                case "/insert":
                    insertUser(request, response);
                    break;
                case "/delete":
                    deleteUser(request, response);
                    break;
                case "/logout":
                    logoutUser(request, response);
                    break;
                default:
                    showLoginForm(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    private void showLoginForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if(sessionUser(request)) {
            response.sendRedirect("list");
        }
        else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("user-login.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user =  userRepository.loginUser(email, password);

        if(sessionUser(request)) {
            response.sendRedirect("list");
        }
        else if (user != null) {
            HttpSession session=request.getSession();
            session.setAttribute("uemail",user.getEmail());
            session.setAttribute("urole",user.getRole());
            response.sendRedirect("list");
        }
        else {
            request.setAttribute("isLoginFailed", true);
            request.getRequestDispatcher("user-login.jsp").forward(request, response);
        }
    }

    private boolean sessionUser(HttpServletRequest request) {
        HttpSession session=request.getSession();
        String uemail=(String)session.getAttribute("uemail");
        String urole=(String)session.getAttribute("urole");
        if(uemail == null || urole==null)
            return false;
        return true;
    }

    private void listUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {

        if(sessionUser(request)) {
            RequestDispatcher dispatcher = null;
            HttpSession session=request.getSession();
            if(session.getAttribute("urole").equals("Administrator")) {
                List<User> listUser = userRepository.selectAllUsers();
                request.setAttribute("listUser", listUser);
                dispatcher = request.getRequestDispatcher("user-admin.jsp");
            }
            else {
                User user = userDAO.selectUser((String)session.getAttribute("uemail"), (String)session.getAttribute("urole"));
                request.setAttribute("user", user);
                dispatcher = request.getRequestDispatcher("user-nonadmin.jsp");
            }
            dispatcher.forward(request, response);
        }
        else
            response.sendRedirect("login");
    }

    private void logoutUser(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        session.setAttribute("uemail",null);
        session.setAttribute("urole",null);
        request.setAttribute("isLogoutSuccess", true);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-login.jsp");
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User existingUser = userRepository.selectUser(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        request.setAttribute("user", existingUser);
        dispatcher.forward(request, response);
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        String status = request.getParameter("status");
        User newUser = new User(name, email, password, role, status);
        userRepository.insertUser(newUser);
        response.sendRedirect("list");
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("userId"));
        userRepository.deleteUser(id);
        response.sendRedirect("list");

    }

}
