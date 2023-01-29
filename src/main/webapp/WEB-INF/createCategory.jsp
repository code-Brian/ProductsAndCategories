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

<title>Category | Create</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="navbar">
			</div>
		</div>
		<div class="row">
			<form:form>
				<div class="row">
					<div class="col">
						<form:label path="name">Name:</form:label>
						<form:input path="name"/>
						<form:errors path="name"/>
					</div>
				</div>
				<button class="btn btn-primary">Create Category</button>
			</form:form>
		</div>
	</div>
</body>
</html>