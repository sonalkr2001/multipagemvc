<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
	<h1> Fetching data from controller to view using ModelAndView  </h1>
	<%
		String name=(String) request.getAttribute("name");
		Integer r=(Integer) request.getAttribute("roll");
		LocalDateTime time=(LocalDateTime) request.getAttribute("Time");
	%>
	<h1> Name of Employee is <%=name %></h1>
	<h1> Id of Employee is  <%=r %></h1>
	<h1> Today Date and time is <%=time %> </h1>
</body>
</html>