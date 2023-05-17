<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addNum" method="post">
		<table>
			<tr>
				<td>First number</td>
				<td><input type="text" name="num1"></td>
			</tr>
			<tr>
				<td>Second number</td>
				<td><input type="text" name="num2"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="sum"></td>
			</tr>
		</table>

	</form>


	<%
	if(request.getAttribute("result")!=null)
	out.print(request.getAttribute("result"));

	%>
</body>
</html>