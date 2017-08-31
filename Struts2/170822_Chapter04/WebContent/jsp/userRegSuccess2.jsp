<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>회원가입 완료</title>
<meta charset="UTF-8">
</head>
	<body>
	<center>
		<b><font color="red">회원가입이 완료되었다.</font></b>
		<p>아이디 : ${user.userId}
		<p>비밀번호 : ${user.userPW}
		<p>이름 : ${user.userName}
		<p>
	</center>
</body>
</html>