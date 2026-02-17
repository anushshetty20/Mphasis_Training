<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
	<center>
		<h1 align="center">:: Employee Form ::</h1>
		<form action="empdata.jsp">
			Employee ID: <input type="number" name="id"><br><br>
			Employee Name: <input type="text" name="name"><br><br>
			Employee Company: <input type="text" name="cmp"><br><br>
			Employee Designation: <input type="text" name="dsg"><br><br>
			
			<input type="submit" value="submit">
		</form>
	</center>
</body>
</html>