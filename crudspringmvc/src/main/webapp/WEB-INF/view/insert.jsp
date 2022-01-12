<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./add" method="post">
		Firstname : <input type="text" name="firstname">
		Lastname : <input type="text" name="lastname">
		Designation : <input type="text" name="designation">
		Salary : <input type="number" name="salary">
		DOJ : <input type="date" name="doj">
		Email : <input type="email" name="mail">
		<input type="submit" value="Submit">
	
	</form>

</body>
</html>