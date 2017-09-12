<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
	<center>
		<s:bean name="model.Board" id="board">
			<s:param name="no" value="1" />
			<s:param name="subject" value="'첫방문'" />
			<s:param name="name" value="'suy'" />
			<s:param name="content" value="'게시판 오픈을 축하합니다.'" />
		</s:bean>

		<s:push value="board" />

		<table border="1" cellspacing="0" cellpadding="1">
			<tr align="center" bgcolor="#F3F3F3">
				<th width="50">번호</th>
				<th width="100">제목</th>
				<th width="100">글쓴이</th>
				<th width="400">내용</th>
			</tr>

			<tr align="center">
				<td>
					<s:property value="#board.no" />
				</td>
				<td>
					<s:property value="#board.subject" />
				</td>
				<td>
					<s:property value="#board.name" />
				</td>
				<td>
					<s:property value="#board.content" />
				</td>
			</tr>
		</table>
	</center>
</body>
</html>