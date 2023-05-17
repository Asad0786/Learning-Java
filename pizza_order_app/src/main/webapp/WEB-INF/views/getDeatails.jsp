<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details!</title>
</head>
<body>

	<form action="CheckOrder" method="post">
		<table>
			<tr>
				<td>Enter your orderID: </td>
				<td><input type="number" min="1"  name ="order"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Fetch" ></td>
			</tr>
		</table>
	</form>
	
	<%
	if(request.getAttribute("name") == "null"){
		out.println("OrderID is invalid and not found");
	}
	%>

</body>
</html>