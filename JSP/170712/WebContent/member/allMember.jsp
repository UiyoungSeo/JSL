<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width='800' border='1'>
<tr>
<th>이름</th><th>아이디</th><th>암호</th><th>이메일</th><th>전화번호</th><th>권한(0:회원,1:관리자)</th>
</tr>


</table>
</body>
</html>