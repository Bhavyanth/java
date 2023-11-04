package com.java.jdbc;

import java.sql.*;

public class Jdbc {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/jdbcDemo";

        Animal animal = new Animal("Tiger", 12,"Sumatran");
        String query = "insert into animal(name,age,breed)" + "values('"+ animal.getName()+"',"+animal.getAge()+",'"+animal.getBreed()+"')";

        // Postgresql driver jar is provided in jars folder
        try(Connection connection = DriverManager.getConnection(url,"postgres","secret");){
            Statement statement = connection.createStatement();
            int i = statement.executeUpdate(query);
            if (i == 1) {
                System.out.println("Insertion Success");
            } else {
                System.out.println("Insertion failed");
            }

        }
        catch(SQLException ex){
                ex.printStackTrace();
        }
    }
}
