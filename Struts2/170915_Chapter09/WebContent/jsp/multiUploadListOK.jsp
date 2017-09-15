<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<meta charset="UTF-8">
</head>
<body>
	<h2>리스트를 이용한 다중 파일 업로드 입력완료 화면</h2>
	<s:iterator value="uploads" status="stat">
		File(<s:property value="%{#stat.index+1}" />)<br />
		컨텐츠 타입:
		<s:property value="%{uploadsContentType[#stat.index]}" />
		<br />
		파일 이름:
		<s:property value="%{uploadsFileName[#stat.index]}" />
		<br />
		임시 파일 이름:
		<s:property value="%{uploads[#stat.index]}" />
		<br />
		<hr />
	</s:iterator>
</body>
</html>