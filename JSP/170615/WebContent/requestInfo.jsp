<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Context Path : <%=request.getContextPath() %>	<br>
	Request Method : <%= request.getMethod() %> 	<br>
	Request URL : <%= request.getRequestURL() %>	<br>
	Request URI : <%=request.getRequestURI() %>	<br>
	Server Name : <%= request.getServerName()%>	<br>
	Protocal :  <%=request.getProtocol() %>	<br>
	Session :  <%=request.getSession() %>	<br>
	Remote Host : <%=request.getRemoteHost() %>	<br>
</body>
</html>