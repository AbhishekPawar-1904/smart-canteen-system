<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<style>
body {
	font-family: sans-serif;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	background-color: #f0f2f5;
}

.login-container {
	background: white;
	padding: 2rem;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
	width: 300px;
	text-align: center;
}

.login-container h2 {
	margin-bottom: 1.5rem;
}

.login-container input {
	width: 92%;
	padding: 10px;
	margin-bottom: 1rem;
	border: 1px solid #ccc;
	border-radius: 4px;
}

.login-container button {
	width: 100%;
	padding: 10px;
	border: none;
	background-color: #007bff;
	color: white;
	border-radius: 4px;
	cursor: pointer;
	font-size: 16px;
}

.error {
	color: red;
	margin-bottom: 1rem;
}
</style>
</head>
<body>
	<div class="login-container">
		<h2>Canteen Admin Login</h2>
		<c:if test="${not empty error}">
			<p class="error">${error}</p>
		</c:if>
		<form action="submitadminlogin" method="post">
			<input type="email" name="email" placeholder="Email" required><br>
			<input type="password" name="password" placeholder="Password"
				required><br>
			<button type="submit">Login</button>
		</form>
	</div>
</body>
</html>