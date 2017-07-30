<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/movie2.css">
<title>映画削除</title>
</head>
<body>
	<div id="wrap" align="center">
		<h1>영화 삭제</h1>
		<form method="post" action="movieDelete.do">
			<table>
				<tr>
					<td style="width: 350px"><c:choose>
							<c:when test="${empty movie.poster }">
								<img src="images/noimage.png">
							</c:when>
							<c:otherwise>
								<img src="images/${movie.poster}">
							</c:otherwise>
						</c:choose></td>
					<td>
						<table>
							<tr>
								<th style="width: 80px">제목</th>
								<td>${movie.title}</td>
							</tr>
							<tr>
								<th>가격</th>
								<td>${movie.price}</td>
							</tr>
							<tr>
								<th>감독</th>
								<td>${movie.director}</td>
							</tr>
							<tr>
								<th>배우</th>
								<td>${movie.actor}</td>
							</tr>
							<tr>
								<th>시놉시스</th>
								<td><div style="height: 220px; width: 100%">
										${movie.synopsis}</div></td>
							</tr>
							<tr>
								<th>사진</th>
								<td>${movie.poster}</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
			<br> <input type="hidden" name="code" value="${movie.code}"><input
				type="submit" value="삭제"> <input type="button" value="목록"
				onclick="location.href='movieList.do'">
		</form>
	</div>
</body>
</html>