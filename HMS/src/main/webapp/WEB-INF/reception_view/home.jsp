<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.hms.model.LoginUserData"%>
<%@ page import="java.time.LocalDate"%>
<%@ page import="java.time.format.DateTimeFormatter"%>
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
<title><%Data.getRole();%> Page</title>
</head>
<body>
<%

	if(request.getAttribute("appointment")!=null)
		out.print("Appointment confirmed");

%>
	<br>
	<br>
	<br>
	<p align="Center">
		Hey,	<%out.print(" "+ Data.getName());%>
	<br><br> 
		Email:<%out.print(Data.getEmail());%>
	<br><br>
		Phone:<%out.print(Data.getContact());}}%>
	<br><br>
	
		Want to create an appointment? <a href="addAppointment">Click here!!</a>
	<br><br>
		want to  deactivate a doctor? <a href="deRegDoc">Click here!!</a>
	<br><br>
	Checkout the appointments <a href="listAppo">Here</a>	
</body>
</html>