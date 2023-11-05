<%--
  Created by IntelliJ IDEA.
  User: bhavy
  Date: 11/5/2023
  Time: 12:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<%--<%@page import="java.util" %> --> this is directive--%>
<html>
<head>
    <title>Addition</title>
</head>
<body style="background-color: aquamarine; text-align: center">
<h2 style="text-align: center">Addition of 2 numbers</h2>
<%--<%! int x = 9;%> --> this is declarative--%>
<%--    the below is a scriplet tag--%>
    <%
//        These are implicit objects
        int i = Integer.parseInt(request.getParameter("number1"));
        int j = Integer.parseInt(request.getParameter("number2"));
        int k = i + j;
//        response.getWriter().println(k); Instead of this use an expression

    %>
<%= k%>

</body>
</html>
