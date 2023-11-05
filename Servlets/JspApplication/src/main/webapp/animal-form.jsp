<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
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
				<a href="" class="navbar-brand"> Animal Management</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Animals</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${animal != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${animal == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${animal != null}">
            			Edit Animal
            		</c:if>
						<c:if test="${animal == null}">
            			Add New Animal
            		</c:if>
					</h2>
				</caption>
					<fieldset class="form-group">
						<label>Animal Id</label> <input type="text"
														  value="<c:out value='${animal.id}' />" class="form-control"
														  name="name" required="required">
					</fieldset>
				<fieldset class="form-group">
					<label>Animal Name</label> <input type="text"
						value="<c:out value='${animal.name}' />" class="form-control"
						name="name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Age</label> <input type="text"
						value="<c:out value='${animal.age}' />" class="form-control"
						name="age">
				</fieldset>

				<fieldset class="form-group">
					<label>Breed</label> <input type="text"
						value="<c:out value='${animal.breed}' />" class="form-control"
						name="breed">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
