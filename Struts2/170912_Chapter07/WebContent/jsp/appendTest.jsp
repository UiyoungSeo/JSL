<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<center>
		<s:append id="totalList">
			<s:param value="%{list}" />
			<s:param value="%{list2}" />
		</s:append>

		<table border="1" cellspacing="0" cellpadding="1">
			<tr algin="center" bgcolor="#F3F3F3">
				<th width="50">번호</th>
				<th width="100">제목</th>
				<th width="100">글쓴이</th>
				<th width="400">내용</th>
			</tr>

			<s:iterator value="totalList">
				<tr align="center">
					<td>
						<s:property value="no" />
					</td>
					<td>
						<s:property value="subject" />
					</td>
					<td>
						<s:property value="name" />
					</td>
					<td>
						<s:property value="content" />
					</td>
				</tr>
			</s:iterator>
		</table>
	</center>
</body>
</html>