function movieCheck() {
  if (document.frm.title.value.length == 0) {
    alert("영화 제목을 입력해주세요");
    frm.title.focus();
    return false;
  }
  if (document.frm.price.value.length == 0 || document.frm.price.value.length == null) {
    alert("가격을 써주세요");
    frm.price.focus();
    return false;
  }
  if (isNaN(document.frm.price.value)) {
    alert("가격은 숫자를 입력해야 합니다.");
    frm.price.focus();
    return false;
  }
  return true;
}
