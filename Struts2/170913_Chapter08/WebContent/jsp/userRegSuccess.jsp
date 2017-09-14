<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>회원 가입 완료</title>
</head>
<center>
	<body>
		<b>
			<font color="red">회원 가입이 완료되었다.</font>
		</b>
		<p>
			아 이 디 :
			<s:property value="userId" />
		<p>
			비밀번호 :
			<s:property value="userPW" />
		<p>
			이 름 :
			<s:property value="userName" />
		<p>
			나 이 :
			<s:property value="userAge" />
		<p>
			이 메 일 :
			<s:property value="userEmail" />
		<p>
	</body>
</center>
</html>