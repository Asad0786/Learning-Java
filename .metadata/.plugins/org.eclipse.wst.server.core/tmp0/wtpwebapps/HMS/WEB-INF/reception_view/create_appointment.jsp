<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="com.hms.model.LoginUserData"%>
<%@ include file="/WEB-INF/common_view/menu.jsp" %>

<%

if (session == null){
	RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	rd.forward(request, response);
}
else {
	if (session.getAttribute("userData") != null) {
		LoginUserData Data = (LoginUserData) session.getAttribute("userData");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>
	<%out.print(Data.getName());%>
</title>
</head>
<body>
	<form action="fixAppointment" method="post">

		<table>
			<tr>
				<td><br>Patient Email:</td>
				<td><br> <select name="patEmail">
						<%
						try {
							ResultSet rs = (ResultSet) request.getAttribute("rs");
							while (rs.next()) {
								String email = rs.getString(3);
						%>
						<option><%=email%></option>
						<%
						}
						} catch (Exception e) {
						e.printStackTrace();
						}
						%>
				</select></td>
				<td>Did't found name?<a href="createPatient"> Register </a>the
					patient first!
				</td>
			</tr>
			<tr>
				<td><br>Doctor Email:</td>
				<td><br> <select name="docEmail">
						<%
						try {
							ResultSet ds = (ResultSet) request.getAttribute("ds");
							while (ds.next()) {
								String email = ds.getString(3);
						%>
						<option><%=email%></option>
						<%
						}
						} catch (Exception e) {
						out.println("Error: " + e.getMessage());
						}
	}
}
						%>
				</select></td>
			</tr>

			<tr>
				<td><br>Date:</td>
				<td><br> <input type="date" name="appDate"></td>
			</tr>
			<tr>
				<td><br>Disease:</td>
				<td><br> <input type="text" name="disease"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="Submit" value="Book!"></td>
			</tr>
		</table>


	</form>
</body>
</html>