<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% String s= (String) request.getAttribute("data"); %>
	<h1> Welcome <%= s %></h1>
	<a href="./inbox1"> Go to inbox </a>
</body>
</html>