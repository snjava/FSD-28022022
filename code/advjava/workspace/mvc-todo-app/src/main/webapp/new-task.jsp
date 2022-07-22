<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ToDo App : Create Task</title>
</head>
<body>

<%@ include file="menu.jsp" %>


<div align="center">
	<h2>Create New Task</h2>
	<form action="create-new-task">
		Task Title : <input name="title">
		<br><br>
		Task Description : <textarea rows="3" cols="20" name="desc"></textarea>
		<br><br>
		Scheduled Date : <input type="date" name="scheduledon">
		<br><br>
		Task Status <select name="status">
						<option value="Open">Open</option>
						<option value="InProgress">InProgress</option>
						<option value="Completed">Completed</option>
					</select>
		<br><br>
		<button type="submit">Create Task</button>
	
	</form>
</div>

</body>
</html>