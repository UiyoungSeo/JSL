package phonebook.answer;

public class PhoneInfo {
	String name, phoneNumber, birthDate;

	public PhoneInfo(String _name, String _phoneNumber, String _birthDate) {
		name = _name;
		phoneNumber = _phoneNumber;
		birthDate = _birthDate;
	}
	
	public PhoneInfo(String _name, String _phoneNumber){
		name = _name;
		phoneNumber = _phoneNumber;
		birthDate = null;
	}

	public void showPhoneInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		if (birthDate != null)
			System.out.println("생년월일 : " + birthDate);
		System.out.println();
	}
}
