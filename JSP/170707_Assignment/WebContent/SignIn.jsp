<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${param.id}님
	<c:if test="${param.select==1}">사용자 </c:if>
	<c:if test="${param.select==2}">관리자 </c:if>
	로 로그인하셨습니다.
</body>
</html>