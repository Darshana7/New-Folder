<%@page import="java.util.function.Function"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
	String str = request.getParameter("r1");
		int i= Integer.parseInt(request.getParameter("number1"));
		int j= Integer.parseInt(request.getParameter("number2"));
		int res = 0;
		if("add".equals(str)){
			res=i+j;
		}else if("sub".equals(str)){
			res=i-j;
		}else if("mul".equals(str)){
			res=i*j;
		}else if("div".equals(str)) {
			res=i/j;
		}else if("per".equals(str)) {
			res=(i*j)/100;
		}
		out.println(res);
	%>
	
</body>
</html>