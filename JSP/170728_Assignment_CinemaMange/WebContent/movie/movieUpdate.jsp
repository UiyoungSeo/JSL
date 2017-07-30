<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/movie2.css">
<script type="text/javascript" src="script/movie.js"></script>
<title>映画管理</title>
</head>
<body>
	<div id="wrap" align="center">
		<h1>영화 수정</h1>
		<form method="post" enctype="multipart/form-data" name="frm">
			<input type="hidden" name="code" value="${movie.code}"> <input
				type="hidden" name="nonmakeImg" value="${movie.poster}">
			<table>
				<tr>
					<td><c:choose>
							<c:when test="${empty movie.poster}">
								<img src="images/noimage.png">
							</c:when>
							<c:otherwise>
								<img src="images/${movie.poster}">
							</c:otherwise>
						</c:choose></td>
					<td>
						<table>
							<tr>
								<th style="">제목</th>
								<td><input type="text" name="title" value="${movie.title}"
									size="80"></td>
							</tr>
							<tr>
								<th style="">가격</th>
								<td><input type="text" name="price" value="${movie.price}">원</td>
							</tr>
							<tr>
								<th style="">감독</th>
								<td><input type="text" name="director"
									value="${movie.director}" size="80"></td>
							</tr>
							<tr>
								<th style="">배우</th>
								<td><input type="text" name="actor" value="${movie.actor}"
									size="80"></td>
							</tr>
							<tr>
								<th style="">시놉시스</th>
								<td><textarea cols="90" rows="10" name="synopsis">${movie.synopsis}</textarea></td>
							</tr>
							<tr>
								<th style="">사진</th>
								<td><input type="file" name="poster"><br></td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br> <input type="submit" value="수정"
				onclick="return movieCheck()"> <input type="reset"
				value="다시작성"> <input type="button" value="목록"
				onclick="location.href='movieList.do'">
		</form>
	</div>
</body>
</html>