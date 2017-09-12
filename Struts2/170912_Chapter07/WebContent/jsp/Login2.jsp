<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sign On</title>
</head>
<body>
	<s:property value="username"/>
	<s:property value="message"/>

	<s:form action="Login2.action">
		<s:textfield label="아이디" name="userid" value="%{userid}"/>
		<s:password label="비밀번호" name="userpw" value="%{userpw}"/>
		<s:submit/>
	</s:form>
</body>
</html>