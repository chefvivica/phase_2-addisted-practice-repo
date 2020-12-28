<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session Logout</title>

<style>
h3 {
	text-align: center;
	color:red;
}


</style>
</head>
<body>
	<%
		session.invalidate();
	%>
	<h3>You logged out successfully.</h3>
	<br>
	
	<a href="index.jsp" >Login again</a>
	
</body>
</html>
