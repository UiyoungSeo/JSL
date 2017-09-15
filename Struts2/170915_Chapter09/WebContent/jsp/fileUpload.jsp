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
		<h2>파일 업로드 입력 폼</h2>
		<s:form action="FileUploadAction" method="POST" enctype="multipart/form-data">
		<s:file name="upload" label="File" size="50"/>
		<s:submit/>
		</s:form>       
    </body>
</html>