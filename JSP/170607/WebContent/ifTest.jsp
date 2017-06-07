<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>	<!-- POST방식일때 폼으로 넘어오는 값을 받아오는 페이지에 써줘야 안깨진다. -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>두 수를 비교</title>
</head>
<body>
	<%
		String strName = request.getParameter("name");
		String strAge = request.getParameter("age");
		
		if(Integer.parseInt(strAge)>20)
			out.println(strName+"님은 성인 입니다.");
		else
			out.println(strName+"님은 성인이 아닙니다.");
	%>
</body>
</html>