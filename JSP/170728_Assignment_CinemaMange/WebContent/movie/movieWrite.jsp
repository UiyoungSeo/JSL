<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/movie2.css">
<script type="text/javascript" src="script/movie.js"></script>
<title>映画登録</title>
</head>
<body>
	<div id="wrap" align="center">
		<h1>영화 등록</h1>
		<form method="post" enctype="multipart/form-data" name="frm">
			<table>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" size="100%"></td>
				</tr>
				<tr>
					<th>가격</th>
					<td><input type="text" name="price" size="100%"></td>
				</tr>
				<tr>
					<th>감독</th>
					<td><input type="text" name="director" size="100%"></td>
				</tr>
				<tr>
					<th>배우</th>
					<td><input type="text" name="actor" size="100%"></td>
				</tr>
				<tr>
					<th>설명</th>
					<td><textarea cols="100%" rows="10" name="synopsis"></textarea></td>
				</tr>
				<tr>
					<th>사진</th>
					<td><input type="file" name="poster"></td>
				</tr>
			</table>
			<input type="submit" value="등록" onclick="return movieCheck()">
			<input type="reset" value="다시작성">
			<input type="button" value="목록" onclick="location.href='movieList.do'">
		</form>
	</div>
</body>
</html>