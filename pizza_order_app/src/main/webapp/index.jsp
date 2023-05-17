<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.wide-select {
	width: 70px;
}
</style>
<meta charset="ISO-8859-1">
<title>Pizza Registeration!!</title>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<h1 align="center">Chutiya Pizza's</h1>
	<br>
	<br>

	<form action="orderConfirm" method="post">
		<b>
			<table align="center">
				<tr>
					<td>Name</td>
					<td>Pizza ID</td>
					<td>Phone Number</td>
				</tr>
				<tr>
					<td><input type="text" name="custName" /></td>
					<td align="center"><select class="wide-select" name="pid">
							<option>0</option>
							<option>1</option>
							<option>2</option>
							<option>3</option>
					</select></td>
					<td><input type="text" placeholder="xxxxxxxxxx"
						name="custPhone" /></td>
				</tr>
				<tr>
					<td></td>
					<td><br> <input type="submit" value="order!!" /></td>
				</tr>
			</table>
		</b>
	</form>



</body>
</html>