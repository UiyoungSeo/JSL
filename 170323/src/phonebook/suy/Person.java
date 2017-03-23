package phonebook.suy;
import java.util.Scanner;

public class Person {
	private String name;
	private String phoneNumber;
	private String birthDate;
	private Scanner sc;

	public static int count = 0;

	/*
	 * public Person(String _name, String _phoneNumber, String _birthDate) {
	 * name = _name; phoneNumber = _phoneNumber; birthDate = _birthDate;
	 * 
	 * sc = new Scanner(System.in); }
	 */

	public Person() {

		sc = new Scanner(System.in);
	}

	public void addPerson() {
		System.out.print("이름>>");
		name = sc.next();
		System.out.print("전화번호>>");
		phoneNumber = sc.next();
		System.out.print("생년월일>>");
		birthDate = sc.next();
		/* p[count]= new Person(name, phoneNumber, birthDate); */
		System.out.println((count + 1) + "번째 전화번호가 등록되었습니다.");
		count++;
	}

	public void showInfo() {
		System.out.println("이름 : " + name + "\t" + "전화번호 : " + phoneNumber + "\t\t" + "생년월일 : " + birthDate);
	}
}
