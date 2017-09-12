<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
	<s:bean name="model.Board" id="board">
		<s:param name="no" value="1" />
		<s:param name="subject" value="'TCPL'" />
		<s:param name="name" value="'Denise Richie'" />
		<s:param name="content" value="'The C Programming Language'" />
	</s:bean>
	
	<s:set name="title" value="#board.subject" scope="application"/>
	<s:set name="title" value="#board.subject" scope="session"/>
	<s:set name="title" value="#board.subject" scope="request"/>
	<s:set name="title" value="#board.subject" scope="page"/>
	<s:set name="title" value="#board.subject"/>
	
	application.title : <s:property value="#application.title"/><hr/>
	session.title : <s:property value="#session.title"/><hr/>
	request.title : <s:property value="#request.title"/><hr/>
	page.title : ${title}<hr/>
	title : <s:property value="title"/><hr/>
	

</body>
</html>