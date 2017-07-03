<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src='SignUp.js'></script>
	<title>Sign Up</title>
</head>
<body>
	<form method="get" action="SignUpServlet" name="signUpForm">
	<table>
		<tr>
			<td><label for="name">이름 </label></td>
			<td><input type="text" id="name" name="name"></td>
		</tr>
		<tr>
			<td><label>주민등록번호 </label></td>
			<td><input type="text" name="social_no1">-<input type="text" name="social_no2"></td>
		</tr>
		<tr>
			<td><label for="id">아이디 </label></td>
			<td><input type="text" id="id" name="id"></td>
		</tr>
		<tr>
			<td><label for="pwd">비밀번호</label></td>
			<td><input type="password" id="pwd" name="pwd"></td>
		</tr>
		<tr>
			<td><label for="pwd_confirm">비밀번호 확인 </label></td>
			<td><input type="password" id="pwd_confirm" name="pwd_confirm"></td>
		</tr>
		<tr>
			<td><label for="email">이메일 </label></td>
			<td>
			<input type="text" name="email">@<input type="text" name="email_service">
			<select name="email_service_select">
		        <option value="">직접입력</option>
		        <option value="gmail.com">gmail</option>
		        <option value="naver.com">naver</option>
		        <option value="daum.net">daum</option>
	    	</select>
	    	</td>
		</tr>
		<tr>
			<td><label for="post_number">우편번호</label></td>
			<td> 
		    	<input type="text" id="post_number" name="post_number">
	   		 </td>
		</tr>
		<tr>
			<td><label for="address">주소</label></td>
			<td><input type="text" id="address_1" name="address_1"> <input type="text" id="address_2"name="address_2"></td>
		</tr>
		<tr>
			<td><label for="phone">핸드폰번호</label></td>
			<td><input type="text" id="phone" name="phone"></td>
		</tr>
		<tr>
			<td><label for="job">직업</label></td>
			<td>    
				<select id="job" name="job" size="4">  
	       			<option value="학생">학생</option> 
	       			<option value="컴퓨터/인터넷">컴퓨터/인터넷</option> 
	       			<option value="언론">언론</option> 
	       			<option value="공무원">공무원</option> 
	    		</select>
	    </td>
		</tr>
		<tr>
			<td> <label for="chk_mail">메일/SMS 정보 수신</label></td>
			<td> 
				<input type="radio" id="chk_mail" name="chk_mail" checked> 수신 
				<input type="radio" id="chk_mail" name="chk_mail"> 수신거부</td>
		</tr>
		<tr>
			<td><label for="interest">관심분야</label></td>
			<td>  
				<input type="checkbox" id="interest" name="interest" value="생두"> 생두         
				<input type="checkbox" id="interest" name="interest" value="원두"> 원두         
				<input type="checkbox" id="interest" name="interest" value="로스팅"> 로스팅         
				<input type="checkbox" id="interest" name="interest" value="핸드드립"> 핸드드립         
				<input type="checkbox" id="interest" name="interest" value="에스프레소"> 에스프레소         
				<input type="checkbox" id="interest" name="interest" value="창업"> 창업
	      	</td>
		</tr>
	</table>
	<br>
	<input type="submit" value="회원가입" onclick="return signUp()">
	<input type="reset" value="취소">
	</form>
</body>
</html>