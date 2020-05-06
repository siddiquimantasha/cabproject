<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver view</title>
</head>
<body>
		
		<h1>Hello Driver</h1>
		<form>
		
			Cab Number : <input type="text" name="cabno" required>
			<br><br>
			From Location : <input type="text" name="fromlocation" required>
			<br><br>
			To Location : <input type="text" name="droplocation" required>
			<br><br>
			Time of departure : <input type="text" name="timeofdeparture" required>
			<br><br>
			Time of arrival : <input type="text" name="timeofarrival" required>
			<br><br>
			Number of seats : <input type="text" name="seatsavailable" required>
			<br><br>
			<button type="submit">Post Ride</button>
			
		</form>	
	</body>
</html>