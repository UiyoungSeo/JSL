<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>유효성 검사</title>
</head>
<body>
	<center>
		Required Validator :${requiredValidator}
		<br>
		Field Expression Validator : ${fieldExpressionValidator}
		<br>
		URL Validator : ${urlValidator}
		<br>
		String Length Validator : ${stringLengthValidator}
		<br>
		Regex Validator : ${regexValidator}
		<br>
	</center>
</body>
</html>
