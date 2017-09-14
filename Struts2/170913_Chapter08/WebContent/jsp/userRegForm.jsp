<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>회원 가입</title>
</head>
<body>
	<center>
		<h2>회원 가입</h2>
		<p>
			<s:form action="UserRegAction" validate="true">
				<s:textfield label="아이디" name="userId" />
				<s:password label="비밀번호" name="userPW" value="%{userPW}" />
				<s:textfield label="이름" name="userName" value="%{userName}" />
				<s:textfield label="나이" name="userAge" value="%{userAge}" />
				<s:textfield label="이메일" name="userEmail" value="%{userEmail}" />
				<s:submit />
			</s:form>
	</center>
</body>
</html>