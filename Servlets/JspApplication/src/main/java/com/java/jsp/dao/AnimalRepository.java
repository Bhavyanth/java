package com.java.jsp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.java.jsp.model.Animal;

public class AnimalRepository {
	private String jdbcURL = "jdbc:postgresql://localhost:5432/jdbcDemo";
	private String username = "postgres";
	private String password = "secret";

	private static final String INSERT_ANIMALS = "insert into animal" + "  (id,name, age, breed) values "
			+ " (?, ?, ?, ?);";

	private static final String SELECT_BY_ID = "select id, name,age,breed from animal where id =?";
	private static final String SELECT_ALL = "select * from animal";
	private static final String DELETE_ANIMAL = "delete from animal where id = ?;";
	private static final String UPDATE_ANIMALS = "update animal set name = ?,age= ?, breed =? where id = ?;";

	public AnimalRepository() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(jdbcURL, username, password);
		} catch (SQLException  | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void insertAnimal(Animal animal) {
		System.out.println(INSERT_ANIMALS);
		try (Connection connection = getConnection();
			 PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ANIMALS)) {
			preparedStatement.setString(1, UUID.randomUUID().toString().substring(0,5));
			preparedStatement.setString(2, animal.getName());
			preparedStatement.setInt(3, animal.getAge());
			preparedStatement.setString(4, animal.getBreed());
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
			 PreparedStatement statement = connection.prepareStatement(DELETE_ANIMAL);) {
			statement.setString(1, id);
			isDeleted = statement.executeUpdate() > 0;
		}
		return isDeleted;
	}

	public boolean updateAnimal(Animal animal) throws SQLException {
		boolean isUpdated;
		try (Connection connection = getConnection();
			 PreparedStatement statement = connection.prepareStatement(UPDATE_ANIMALS);) {
			statement.setString(1, animal.getName());
			statement.setInt(2, animal.getAge());
			statement.setString(3, animal.getBreed());
			statement.setString(4, animal.getId());
			isUpdated = statement.executeUpdate() > 0;
		}
		return isUpdated;
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
