package com.java.jsp.web;

import com.java.jsp.dao.AnimalRepository;
import com.java.jsp.model.Animal;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


@WebServlet("/")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AnimalRepository animalRepository;
	
	public void init() {
		animalRepository = new AnimalRepository();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				insertAnimal(request, response);
				break;
			case "/delete":
				deleteAnimal(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateAnimal(request, response);
				break;
			default:
				listAllAnimals(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listAllAnimals(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Animal> listAnimal = animalRepository.selectAllAnimals();
		request.setAttribute("listAnimal", listAnimal);
		RequestDispatcher dispatcher = request.getRequestDispatcher("animal-list.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("animal-form.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		String animalId = request.getParameter("id");
		Animal existingAnimal = animalRepository.selectAnimal(animalId);
		RequestDispatcher dispatcher = request.getRequestDispatcher("animal-form.jsp");
		request.setAttribute("animal", existingAnimal);
		dispatcher.forward(request, response);

	}

	private void insertAnimal(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String animalId = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String breed = request.getParameter("breed");
		Animal newAnimal = new Animal(animalId,name, age, breed);
		animalRepository.insertAnimal(newAnimal);
		response.sendRedirect("list");
	}

	private void updateAnimal(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String animalId = request.getParameter("id");
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String breed = request.getParameter("breed");
		Animal animal = new Animal(animalId, name, age, breed);
		animalRepository.updateAnimal(animal);
		response.sendRedirect("list");
	}

	private void deleteAnimal(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {
		String name = request.getParameter("name");
		animalRepository.deleteAnimal(name);
		response.sendRedirect("list");

	}

}
