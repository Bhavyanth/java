package com.java.jsp.dao;

import com.java.jsp.model.Animal;
import com.java.jsp.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserRepository {

    private String jdbcURL = "jdbc:postgresql://localhost:5432/jdbcDemo";
    private String username = "postgres";
    private String password = "secret";

    private static final String INSERT_USER = "insert into user" + "  (userId,username, password) values "
            + " (?, ?, ?);";
    private static final String SELECT_BY_ID = "select userId,username, password from user where userId =?";
    private static final String SELECT_ALL = "select * from user";
    private static final String DELETE_USER = "delete from user where userId = ?;";


    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcURL, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void insertAnimal(User user) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER)) {
            preparedStatement.setString(1, UUID.randomUUID().toString().substring(0,5));
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setString(3, encryptPassword(user.getPassword()));
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printsqlexception(e);
        }
    }

    public Animal selectAnimal(String id) {
        Animal animal = null;
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);) {
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String animalId = rs.getString("id");
                String animalName = rs.getString("name");
                int age = rs.getInt("age");
                String breed = rs.getString("breed");
                animal = new Animal(animalId, animalName, age, breed);
            }
        } catch (SQLException e) {
            printsqlexception(e);
        }
        return animal;
    }

    public List<Animal> selectAllAnimals() {
        List<Animal> animals = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String animalId = rs.getString("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String breed = rs.getString("breed");
                animals.add(new Animal(animalId, name, age, breed));
            }
        } catch (SQLException e) {
            printsqlexception(e);
        }
        return animals;
    }

    public boolean deleteAnimal(String id) throws SQLException {
        boolean isDeleted;
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(DELETE_USER);) {
            statement.setString(1, id);
            isDeleted = statement.executeUpdate() > 0;
        }
        return isDeleted;
    }

    private String encryptPassword(String password) {
        return null;
    }

    private void printsqlexception(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SqlState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
