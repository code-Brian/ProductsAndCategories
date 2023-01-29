<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/app.js"></script>

<title>Product | Create</title>
</head>
<body>
	<div class="container">
		<div class="navbar">
			<h1>New Product</h1>
		</div>
		<div class="row">
			<div class="col">
				<p><a href="/">Home</a></p>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<form:form action="/product/create" method="POST" modelAttribute="product">
					<div class="row">
						<div class="col">
							<form:label path="name">Name</form:label>
							<form:input path="name"></form:input>
							<form:errors path="name"/>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<form:label path="description">Description</form:label>
							<form:input path="description"></form:input>
							<form:errors path="description"/>
						</div>
					</div>
					<div class="row">
						<div class="col">
							<form:label path="price">Price</form:label>
							<form:input path="price" type="number"></form:input>
							<form:errors path="price"/>
						</div>
					</div>
					<button class="btn btn-primary">Create Product</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>