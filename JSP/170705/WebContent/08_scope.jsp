<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	pageContext.setAttribute("name","page man");
	request.setAttribute("name","request man");
	session.setAttribute("name","session man");
	application.setAttribute("name","application man");
	%>
	
	name : ${name}<hr>
	page 속성 : ${pageScope.name }<br>
	request 속성 : ${requestScope.name }<br>
	session 속성 : ${sessionScope.name }<br>
	application 속성 : ${applicationScope.name }<br>
	

</body>
</html>