<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
		<h1>Register</h1>
		<form action="register" method="post">
			Name : <input type="text" name="name" required>
			<br><br>
			Age : <input type="text" name="age">
			<br><br>
			Phone no. : <input type="tel"  name="phoneno" pattern="^\d{10}$" required>
			<br><br>
			City : <input type="text" name="city">
			<br><br>
			Enter your role : 
			Customer <input type="radio" id="customer" name="role" value="customer">
			Driver <input type="radio" id="driver" name="role" value="driver">
			<br><br>
			Email : <input type="text" name="email" required>
			<br><br>
			Password : <input type="password" name="password" required>
			<br><br>
			Repeat password : <input type="password" name="repeatpassword" required>
			<br><br>
    `		<button type="submit">Register</button>

		</form>

	</body>
</html>