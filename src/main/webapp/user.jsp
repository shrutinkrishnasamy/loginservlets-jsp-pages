<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>  welcome to user jsp </h1>
<%
Cookie[] c = request.getCookies();
String user1 = c[0].getValue().toString();
		
%>
<%=user1 %>
</body>
</html>