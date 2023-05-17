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
<title><%=request.getAttribute("role")%> Page</title>
</head>
<body>
	<br>
	<br>
	<br>
	<p align="Center">
		Hey	<%out.print(Data.getName());%>
	<br><br> 
		Email:<%out.print(Data.getEmail());%>
	<br><br>
		Dob:<%out.print(LocalDate.parse(Data.getDob()).format(DateTimeFormatter.ofPattern("dd/MM/yyy")));}}%>
	<br><br>
		
	
</body>
</html>