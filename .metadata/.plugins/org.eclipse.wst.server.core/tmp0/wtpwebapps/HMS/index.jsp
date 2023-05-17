<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="verifyCred" method="post">
		<table>
			<tr>
				<td>Role:</td>
				<td><select name= "role">
						<option>Patient</option>
						<option>Doctor</option>
						<option>Reception</option>
				</select></td>
			</tr>
			<tr>
				<td><br>Email/Username:</td>
				<td><br><input type="text" name="userEmail"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="userPassw"></td>
			</tr>
			<tr>
				<td></td>
				<td><br><input type="Submit" Value="Log In"></td>
			</tr>
		</table>
	</form>
	
	<%
		if((String)request.getAttribute("status")== "Invalid Role/Credentials")
			out.println(request.getAttribute("status"));
	
	
	%>

	

</body>
</html>