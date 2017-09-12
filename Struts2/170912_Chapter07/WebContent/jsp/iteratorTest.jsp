<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <meta charset="UTF-8">
    </head>
    <body>
		<center>
			<table border="1" cellspacing="0" cellpadding="1">
				<tr align="center" bgcolor="#F3F3F3">
				<th width="50">번호</th>
				<th width="100">제목</th>
				<th width="100">글쓴이</th>
				<th width="400">내용</th>
			</tr>
			
			<s:iterator value="list">
				<tr align="center">
				<td><s:property value="no"/></td>
				<td><s:property value="subject"/></td>
				<td><s:property value="name"/></td>
				<td><s:property value="content"/></td>
			</tr>
			</s:iterator>
			</table>
		</center>       
    </body>
</html>