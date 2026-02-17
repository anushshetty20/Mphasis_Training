<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exceptions</title>
</head>
<body>
		<%
			int x = 100;
			int y = 10;
			
			out.println(x/y);
			
		%>
</body>
</html>