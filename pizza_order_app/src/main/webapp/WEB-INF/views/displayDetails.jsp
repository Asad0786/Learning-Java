<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>Name:</td>
			<td>Pizza type:</td>
			<td>Price:</td>
			<td>Phone:</td>
		</tr>
		<tr>
			<td><%=request.getAttribute("Name") %></td>
			<td><%=request.getAttribute("PizzaStyle") %></td>
			<td><%=request.getAttribute("price") %></td>
			<td><%=request.getAttribute("phone") %></td>
		</tr>


	</table>

</body>
</html>