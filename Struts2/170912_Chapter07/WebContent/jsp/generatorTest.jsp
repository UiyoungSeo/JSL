<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
	<center>
		<s:generator id="list" separator="," val="%{'aaa,bbb,cc,dd'}" count="3">
			<s:iterator>
				<s:property />
				<hr />
			</s:iterator>
		</s:generator>
	</center>
</body>
</html>