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

<title>Category | View</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>${category.name}</h1>
			</div>
			<div class="row">
				<div class="col">
					<p><a href="/">Home</a></p>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<h2>Products</h2>
				<ul>
					<c:forEach var="product" items="${assignedProducts}">
						<li>${product.name}</li>
					</c:forEach>
				</ul>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<form:form action="/category/${category.id}/addProduct" method="POST" modelAttribute="product">
					<input type="hidden" name="_method" value="PUT">
					<div class="row">
						<div class="col">
							<form:label path="name">Products</form:label>
							<form:select path="name">
								<c:forEach var="product" items="${unassignedProducts}">
									<form:option path="name" value="${product.id}">${product.name}</form:option>
								</c:forEach>
							</form:select>
						</div>
					</div>
					<button class="btn btn-primary">Add Product</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>