<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tags</title>
</head>
<body>
		<!--  Declaration /tag -->
		
		<%!
			int x = 200;
			int y = 300;
			public int add(){
				return x+y;
			}
		%>
		
		<!-- Expression Tag -->
		
		<%= add() %>
		
		<!-- Scriplet Tag -->
		<br>
		<%
			out.println("CURRENT DATE :"+new Date());
		%>
</body>
</html>