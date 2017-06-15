<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%Timestamp now = new Timestamp(System.currentTimeMillis());
	%>
	<%=now.toString() %>
	
	<br>
	
	현재는 <%=now.getHours() %>시 <%=now.getMinutes() %>분 입니다.
</body>
</html>