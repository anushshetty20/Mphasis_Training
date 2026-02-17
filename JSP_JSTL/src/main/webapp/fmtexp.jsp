<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<c:set var="cdate" value="<%= new Date() %>"></c:set>
		<c:out value="${cdate}"></c:out>
		<h1>Date Time Format</h1>
		<h3>
			Time : <fmt:formatDate type="time" value="${cdate}"></fmt:formatDate>
		</h3>
		<h3>
			Date : <fmt:formatDate type="date" value="${cdate}"></fmt:formatDate>
		</h3>
		<h3>
			Date & Time : <fmt:formatDate type="both" value="${cdate}"></fmt:formatDate>
		</h3>
		
		<h3>
			Date & Time Short: <fmt:formatDate type="both" dateStyle="short" value="${cdate}"></fmt:formatDate>
		</h3>
		
		<h3>
			Date & Time Medium: <fmt:formatDate type="both" dateStyle="medium" value="${cdate}"></fmt:formatDate>
		</h3>
		
		<h3>
			Date & Time Long: <fmt:formatDate type="both" dateStyle="long" value="${cdate}"></fmt:formatDate>
		</h3>
		
		<h3>
			Date yyyy-MM-dd Pattern: <fmt:formatDate pattern="yyyy-MM-dd" value="${cdate}"></fmt:formatDate>
		</h3>
		
</body>
</html>