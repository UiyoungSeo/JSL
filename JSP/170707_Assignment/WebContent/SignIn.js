function signIn() {
	if (document.signInForm.id.value.length == 0) {
		alert("id를 입력해 주세요.");
		signInForm.id.focus();
		return false;
	} else if (document.signInForm.password.value.length == 0) {
		alert("비밀번호를 입력해 주세요.");
		signInForm.password.focus();
		return false;
	} else if (document.signInForm.select.value != 1 && document.signInForm.select.value != 2 ) {
		alert("사용자 또는 관리자를 선택해 주세요.");
		return false;
	} else {
		return true;
	}
}