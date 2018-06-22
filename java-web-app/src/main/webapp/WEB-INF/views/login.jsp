<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
<title>The Todos App</title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">4Tress</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="/">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="list-todos.do">Todos</a>
				</li>
				<li class="nav-item"><a class="nav-link"
					href="https://www.in28minutes.com/">in28minutes</a></li>
			</ul>
			<ul class="navbar-nav ml-auto">
				<li><a class="nav-link" href="login.do">Login</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">

		
		<div>

			<div class="alert alert-warning alert-dismissible fade show"
				role="alert">
				<strong>Login Error</strong> ${errorMessage}
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<form action="login.do" method="post">
				Username <input type="text" name="username" /> Password <input
					type="password" name="user-password" /> <input type="submit"
					value="Login">
			</form>
		</div>

	</div>

	<footer class="footer">
		<p>footer content</p>
	</footer>

	<!-- JavaScript plugins -->
	<script src="webjars/jquery/3.3.1-1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</body>
</html>
