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

<title>Dashboard</title>
</head>
<body>
	<div class="container p-5">
		<div class="row">
			<div class="navbar border-bottom mb-2">
				<div class="row">
					<div class="col">
						<h1>Home Page</h1>
					</div>
				</div>
			</div>
		</div>
		<div class="row border-bottom mb-2">
			<div class="col">
				<p><a href="/product/create">New Product</a></p>
				<p><a href="/category/create">New Category</a></p>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table class="table table-striped">
					<thead>
						<tr>
							<td>Products</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="product" items="${allProducts}">
							<tr>
								<td><a href="/product/${product.id}/view">${product.name}</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col">
				<table class="table table-striped">
					<thead>
						<tr>
							<td>Categories</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="category" items="${allCategories}">
							<tr>
								<td><a href="/category/${category.id}/view">${category.name}</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>