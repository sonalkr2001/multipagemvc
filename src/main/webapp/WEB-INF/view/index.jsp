<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
	<h1>This is Home page </h1>
	<h1> called by home controller</h1>
	<h1>url /home</h1>
	<%
		String name=(String) request.getAttribute("name");
		Integer id=(Integer) request.getAttribute("id");
		String phone_no=(String)request.getAttribute("phone-no");
		//List<String> friend =(List<String>) request.getAttribute("fr");
	%>
	<h1> Name of Student is <%=name%></h1>
	<h1> Id of Student is  <%=id %></h1>
	<h1> Phone no of Student is  <%=phone_no %></h1>
	
</body>
</html>