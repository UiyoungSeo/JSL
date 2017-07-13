<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src='SignIn.js'></script>
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="SignIn.jsp" name="signInForm">
	ID <input type="text" name="id"> <br>
	PW <input type="password" name="password"> <br>
	<input type="radio" name="select" value="1"> user
	<input type="radio" name="select" value="2"> admin <br>
	<input type="submit" value="Sign In" onclick="return signIn()">
	</form>
</body>
</html>