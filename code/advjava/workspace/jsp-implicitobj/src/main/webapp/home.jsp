<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<body>

<div align="center">
	<h2>Welcome User, <%= request.getParameter("uname") %> </h2>

</div>


</body>
</html>