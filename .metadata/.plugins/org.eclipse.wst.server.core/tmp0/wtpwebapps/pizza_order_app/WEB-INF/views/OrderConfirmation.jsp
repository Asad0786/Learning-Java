<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmed</title>
</head>
<body>


	<pre>
		Thank you for ordering, Your order id is <%
	out.print(request.getAttribute("stats"));
	%> 
	</pre>
	
												

</body>
</html>