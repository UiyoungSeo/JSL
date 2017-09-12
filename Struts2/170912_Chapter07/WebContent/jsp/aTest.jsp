<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
	<s:url id="urltest" action="IteratorAction" namespace="/urlTest" method="execute" />

	<s:url id="urltest2" value="/urlTest/IteratorAction.action" />

	<s:url id="urltest3" action="Login2" namespace="/urlTest">
		<s:param name="userid">suy</s:param>
		<s:param name="userpw" value="1234" />
	</s:url>
	
	<s:a href="%{urltest}">link1</s:a><br/>
	<s:a href="%{urltest2}">link2</s:a><br/>
	<s:a href="%{urltest3}">link3</s:a><br/>
</body>
</html>