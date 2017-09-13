<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
    </head>
    <body>
	<center>
		<b>
			<font color="red">회원가입 완료</font>
		</b>
		아이디 :
		<s:property value="userId" />
		비밀번호 :
		<s:property value="userPW" />
		이름 :
		<s:property value="userName" />
		나이 :
		<s:property value="userAge" />
		이메일 :
		<s:property value="userEmail" />
		
		<input type="button" onclick="history.go(-1)" value="back">
	</center>
</body>
</html>