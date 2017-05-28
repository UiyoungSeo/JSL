package phonebook.answer;

import java.util.Scanner;

public class PhoneBook {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;

		while (choice != 2) {
			showMenu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				addPhoneNumber();
				break;
			case 2:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 선택");
				break;
			}
		}
	}

	private static void showMenu() {
		System.out.println("1. 데이터 입력");
		System.out.println("2. 종료");
		System.out.print("선택>>");
	}

	private static void addPhoneNumber() {
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("전화번호>>");
		String phoneNumber = sc.next();
		sc.nextLine();
		System.out.print("생년월일>>");
		String birthDate = sc.nextLine();

		PhoneInfo info = new PhoneInfo(name, phoneNumber, birthDate);
		System.out.println("입력된 정보 출력");
		info.showPhoneInfo();
	}
}
