<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>회원가입</title>
<meta charset="UTF-8">
</head>
<body>
	<center>
		<h2>회원가입</h2>
		<p>
		<form method="post" action="UserRegLoginAction.action">
			<table cellspacing="10">
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" name="userId" value="${userId}" />
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>
						<input type="password" name="userPW" value="${userPW}" />
					</td>
				</tr>
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="userName" value="${userName}" />
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<input type="submit" value="보내기" />
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>