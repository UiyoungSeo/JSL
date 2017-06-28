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
	String name=null;
	//Cookie에서 name과 value를 얻어와서 비교
	Cookie[] ck = null;
	//1. 클라이언트로부터 Cookie[]를 얻어옴
	ck = request.getCookies();
	if(ck!=null){
		for (Cookie c : ck){
			if(c.getName().equals("userName")){
				name=c.getValue();
			}
				
		}
	%>
	맙소사
	<%=name%>님 안녕하세요!
	<br>
	<form method="post" action="logout.jsp">
		<input type="submit" value="sing out">
	</form>
	<%
		}else{
		%>
		<h2>로그인에 실패했습니다.</h2>
		<p><a href="loginForm.jsp">back</a>
		<%
		}%>
</body>
</html>