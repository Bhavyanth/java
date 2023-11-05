<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Animal Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: #53cae7">
			<div>
				<a href="" class="navbar-brand"> Animal
					Management</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Animals</a></li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<div class="container">
			<h3 class="text-center">List of Animals</h3>
			<hr>
			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/new" class="btn btn-success">Add
					New Animal</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Animal Id</th>
						<th>Name</th>
						<th>Age</th>
						<th>Breed</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="animal" items="${listAnimal}">

						<tr>
							<td><c:out value="${animal.id}" /></td>
							<td><c:out value="${animal.name}" /></td>
							<td><c:out value="${animal.age}" /></td>
							<td><c:out value="${animal.breed}" /></td>
							<td><a href="edit?name=<c:out value='${animal.id}' />">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="delete?name=<c:out value='${animal.id}' />">Delete</a></td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>
