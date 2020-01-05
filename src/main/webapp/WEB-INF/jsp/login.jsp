<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<script type="text/javascript" src="webjars/jquery/3.4.1/dist/jquery.js"></script>
<script type="text/javascript"
	src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<form method="POST" action="login" class="form-signin">
			<h2 class="form-heading">Log in</h2>

			<div class="form-group has-error">
				<span>${msg}</span> <input name="username" type="text"
					class="form-control" placeholder="Username" autofocus="true" /> <input
					name="password" type="password" class="form-control"
					placeholder="Password" /> <span>${errorMsg}</span>

				<button class="btn btn-lg btn-primary btn-block" type="submit">Log
					In</button>
			</div>
		</form>
	</div>
</body>
</html>