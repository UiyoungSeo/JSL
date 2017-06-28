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
		//실제로는 db에서 가져와야하는 값
		String id = "suy";
		String pwd = "1234";
		String name = "Uiyoung Seo";

		if (id.equals(request.getParameter("id")) && pwd.equals(request.getParameter("pwd"))) {
			// 1. Cookie 객체 생성
			Cookie c = new Cookie("userName", name);
			// 2. 유효기간 설정(1분)
			c.setMaxAge(60 * 1);
			// 3. 클라이언트에 쿠키 전송
			response.addCookie(c);
			// 4. 쿠키를 생성하여 클라이언트에 전송
	%>
	<h2>성공적으로 로그인하셨습니다.</h2>
	<p>
		<a href="main.jsp">enter</a>
		<%
			} else {
		%>
		<h2>로그인에 실패했습니다.</h2>
		<p><a href="loginForm.jsp">되돌아가기</a>
	<%
	}
	%>
</body>
</html>