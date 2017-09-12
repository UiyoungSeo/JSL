<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
	<s:property value="a"/>는 
	<s:if test="a < 0"> 
	음수이다.
	</s:if>
	<hr/>
	
	<s:property value="b"/>는 
	<s:if test="b%2 == 0"> 
	짝수이다.
	</s:if>
	<s:else>
	홀수이다
	</s:else>
	<hr/>
	
	<s:property value="c"/>는
	<s:if test="c>0">
	양수이다.
	</s:if>
	<s:elseif test="c<0">
	음수이다.
	</s:elseif>
	<s:else>
	0이다.
	</s:else>
	<hr/>
	
</body>
</html>