function signUp() {
	if (document.signUpForm.name.value.length == 0) {
		alert("이름을  입력해 주세요.");
		signUpForm.name.focus();
		return false;
	} else if (document.signUpForm.social_no1.value.length == 0
			|| document.signUpForm.social_no1.value.length != 6) {
		alert("생년월일 6자를 입력해 주세요.");
		signUpForm.social_no1.focus();
		return false;
	} else if (document.signUpForm.social_no2.value.length == 0
			|| document.signUpForm.social_no2.value.length != 7) {
		alert("주민번호 뒷자리 7자를 입력해 주세요.");
		signUpForm.social_no2.focus();
		return false;
	} else if (isNaN(document.signUpForm.social_no1.value)
			|| isNaN(document.signUpForm.social_no2.value)) {
		alert("주민번호는 숫자로 입력해 주세요.");
		signUpForm.social_no1.focus();
		return false;
	} else if (document.signUpForm.id.value.length == 0) {
		alert("아이디를 입력해 주세요.");
		signUpForm.id.focus();
		return false;
	} else if (document.signUpForm.pwd.value.length == 0) {
		alert("비밀번호를 입력해 주세요.");
		signUpForm.pwd.focus();
		return false;
	} else if (document.signUpForm.pwd_confirm.value.length == 0) {
		alert("비밀번호 확인을 입력해 주세요.");
		signUpForm.pwd.focus();
		return false;
	} else if (document.signUpForm.pwd.value != document.signUpForm.pwd_confirm.value) {
		alert("비밀번호를 확인해주세요.");
		signUpForm.pwd_confirm.focus();
		return false;
	} else {
		return true;
	}
}