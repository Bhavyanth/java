package com.java.jdbc;

import java.sql.*;

public class JdbcUpdate {
    public static void main(String[] args) throws SQLException {

        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Tiger@9959");

            Statement statement = connection.createStatement();

            int rst = statement.executeUpdate("update test.employee set name='Alice' where id=4") ;
            ResultSet resultSet = statement.executeQuery("select * from test.employee");
            if(rst == 1){
                while(resultSet.next())
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3) + " " + resultSet.getInt(4));
            }

            connection.close();
        } catch (Exception e) {

        }
    }
}
