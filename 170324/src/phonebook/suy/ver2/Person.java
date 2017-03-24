package phonebook.suy.ver2;

public class Person {
	private String name, phoneNumber, birthDate;

	public Person(String _name, String _phoneNumber, String _birthDate) {
		name = _name;
		phoneNumber = _phoneNumber;
		birthDate = _birthDate;
	}

	public void showPersonInfo() {
		System.out.print("이름:" + name+" 전화번호:" + phoneNumber);
		if (birthDate != null)
			System.out.print(" 생년월일:" + birthDate);
		System.out.println();
	}
	
	//Getters and Setters
	public String getName(){
		return name;
	}
}
