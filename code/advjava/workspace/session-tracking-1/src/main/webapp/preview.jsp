<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

<%
	String city = request.getParameter("city");
	String pin = request.getParameter("pincode");
	String state = request.getParameter("state");
%>

	
		<h1>Page 3 of 3</h1>
		<hr>
	
		<h3>Name : </h3>
		<h3>Email : </h3>
		<h3>Contact : </h3>
		<h3>City : <%= city %></h3>
		<h3>Pincode : <%= pin %></h3>
		<h3>State : <%= state %></h3>
	</div>
</body>
</html>