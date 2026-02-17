<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Data</title>
</head>
<body>
		<center>
			<h1>:: User Data ::</h1>
			
			<%
				String usr = request.getParameter("user");
				String pas = request.getParameter("pwd");
				session.setAttribute("info",usr);
			
				if(usr.equals("admin") && pas.equals("java")){
				%>
					<jsp:forward page="success.jsp"></jsp:forward>
				<%}else{
					out.println("Invalid credentials");
					%>
					<jsp:include page="userform.jsp"></jsp:include>
				<%		
				}
			%>
		</center>
</body>
</html>