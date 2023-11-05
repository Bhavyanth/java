<%--
  Created by IntelliJ IDEA.
  User: bhavy
  Date: 11/5/2023
  Time: 1:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>JBDC Application</title>
</head>
<body>
    <%
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/jdbcDemo";

        String query = "select * from animal";
        Connection connection = DriverManager.getConnection(url,"postgres","secret");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
    %>
    Name: <%= resultSet.getString(1)%> <br>
    Age: <%= resultSet.getString(2)%> <br>
    Breed: <%= resultSet.getString(3)%> <br>
</body>
</html>
