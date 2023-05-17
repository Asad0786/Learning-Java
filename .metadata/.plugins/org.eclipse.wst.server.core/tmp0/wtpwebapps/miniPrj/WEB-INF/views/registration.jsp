<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lets register!</title>
</head>
<body>

	<form action="saveReg" method= "post">
	<table>
		<tr>
			<td> Name </td>
			<td> <input type="text" name ="userName"> </td>
		</tr>
		<tr>
			<td> Age </td>
			<td> <input type="number" min=10 max=99 name ="userAge"> </td>
		</tr>
		<tr>
			<td> Parentage </td>
			<td> <input type="text" name="parentAge"> </td>
		</tr>
		<tr>
			<td> Email </td>
			<td> <input type="email" name="userEmail"> </td>
		</tr>
		<tr>
			<td> </td>
			<td> <input type="submit" value ="Register"> </td>
		</tr>
	</table>
	</form>

</body>
</html>