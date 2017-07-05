<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:out value="Hello World!" />
	<br>

	<c:set var="name" value="Uiyoung Seo"></c:set>
	\${name} = ${name}
	<br>
	<c:set var="age">27</c:set>
	<!-- 이렇게도 value값을 넣을 수 있다. -->
	\${age} = ${age}
	<hr>

	<c:set var="member" value="<%=new com.suy.javabeans.MemberBean()%>"></c:set>
	<c:set target="${member}" property="name" value="Kudo"></c:set>
	<c:set target="${member}" property="userID">kudokun</c:set>
	\${member} = ${member}
	<hr>

	<c:set var="add" value="${10+5}"></c:set>
	\${add} = ${add}
	<br>
	<c:set var="flag" value="${10>5}"></c:set>
	\${flag} = ${flag}
	<br>
</body>
</html>