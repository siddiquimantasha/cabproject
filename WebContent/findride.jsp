<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find ride</title>
</head>
<body>
		<h1>Lets find your ride...</h1>
		<form>
			
			Pickup location : <input type="text" name="fromlocation" required>
			<br><br>
			<label for="droplocation"><b>To Location </b></label>
			Drop location : <input type="text" name="droplocation" required>
			<br><br>
			Time of ride : <input type="text" name="timeofride" required>
			<br><br>
			<button type="submit">Search</button>

		</form>
	</body>
</html>