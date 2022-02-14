<%@ page import="com.model.User" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

	User u = (User) request.getAttribute("userObject");
	out.println("<h1>Welcome "+ u.getUserName()+"</h1>");

%>
</body>
</html>