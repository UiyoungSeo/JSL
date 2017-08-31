<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입</title>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<center>
		<h2>회원 가입</h2>
		<form method="post" action="UserRegAction2.action">
			<table cellspacing="10">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="user.userId"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="user.userPW"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="user.userName"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="send"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>