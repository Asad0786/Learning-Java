<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">

	<br>
	<br>
	<H1 align="center">LOG IN</H1>

	<form action="verifyLogin" method="post">
		<table align="center">
			<tr>
				<td>Email:</td>
				<td><input type="email" name="userEmail"></td>

			</tr>
			<tr>
				<td><br>Passcode:</td>
				<td><br> <input type="password" name="userPass"></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><br>
				<input type="submit" value="Log in"></td>
			</tr>

		</table>

	</form>
	<br> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
	<%
 if (request.getAttribute("result") != null)
 	out.print(request.getAttribute("result"));
 %>

</body>
</html>