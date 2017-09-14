<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>유효성 검사</title>
</head>
<body>
	<center>
		모든 종류의 오류:
		<br />
		<s:fielderror />
		<hr />

		문자열 길이 오류:
		<br />
		<s:fielderror>
			<s:param>stringLengthValidator</s:param>
		</s:fielderror>
		<hr />

		<s:form action="SampleValidatorAction" theme="xhtml">
			<s:textfield label="Required Validator" name="requiredValidator" />
			<s:textfield label="Field Expression Validator" name="fieldExpressionValidator" />
			<s:textfield label="URL Validator" name="urlValidator" />
			<s:textfield label="String Length Validator" name="stringLengthValidator" />
			<s:textfield label="Regex Validator" name="regexValidator" />
			<s:submit />
		</s:form>
	</center>
</body>
</html>
