<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
	<h2>다중파일 업로드 입력 폼(리스트)</h2>
	<s:form action="MultiUploadListAction" method="POST" enctype="multipart/form-data">
		<s:file label="File (1)" name="uploads" size="50" />
		<s:file label="File (2)" name="uploads" size="50" />
		<s:file label="File (3)" name="uploads" size="50" />
		<s:submit />
	</s:form>
</body>
</html>