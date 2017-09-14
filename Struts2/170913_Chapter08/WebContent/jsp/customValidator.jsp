<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>유효성 검사</title>
</head>
<body>
	<center>
		<s:form action="CustomValidatorAction">
			<s:textfield label="Custom Validator" name="customValidator" />
			<s:submit />
		</s:form>
	</center>
</body>
</html>
