<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to CALCULATOR</h1>
	<form action="./add.jsp" method="post">
		<input type="radio" name="r1" id="add" value="add">Add
		<input type="radio" name="r1" id="sub" value="sub">Sub
		<input type="radio" name="r1" id="mul" value="mul">Mul
		<input type="radio" name="r1" id="div" value="div">Div
		<input type="radio" name="r1" id="per" value="per">Per
		<input type="radio" name="r1" id="fib" value="fib">Fib<br><br>
		
		
		<input type="text" placeholder="Enter 1st number:" name="number1">
		<input type="text" placeholder="Enter 2nd number" name="number2"><br><br>
		<input type="submit">
	</form>	

</body>
</html>