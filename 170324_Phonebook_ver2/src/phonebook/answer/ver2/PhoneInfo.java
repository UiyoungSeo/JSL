package phonebook.answer.ver2;

class PhoneInfo{
	private String name, phoneNumber, birthDate;

	public PhoneInfo(String name, String phoneNumber, String birthDate) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
	}

	public void showInfo(){
		System.out.println("이름:"+name+" 전화번호:"+phoneNumber+" 생년월일"+birthDate);
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
}