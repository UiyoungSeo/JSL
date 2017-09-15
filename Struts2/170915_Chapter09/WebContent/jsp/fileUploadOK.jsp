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
		<h2>파일 업로드 입력 완료</h2>
		
		<ul>
			<li>ContentType: <s:property value="uploadContentType"/></li>
			<li>FileName: <s:property value="uploadFileName"/></li>
			<li>File: <s:property value="upload"/></li>
		</ul>       
    </body>
</html>