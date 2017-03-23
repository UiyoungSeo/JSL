package phonebook.suy;

import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		Person[] p;

		System.out.print("등록할 전화번호의 수 입력 >>");
		p = new Person[sc.nextInt()];

		while (true) {
			showMenu();
			choice = sc.nextInt();

			if (choice == 1) {
				if (Person.count >= p.length) {
					System.out.println("꽉 찼습니다.");
					continue;
				}
				p[Person.count] = new Person();
				p[Person.count].addPerson();
			} else if (choice == 2) {
				System.out.println("──────────────────입력된 정보 출력──────────────────");
				for (int i = 0; i < Person.count; i++) {
					System.out.print((i + 1) + "  ");
					p[i].showInfo();
				}
				System.out.println("───────────────────────────────────────────────────");
			} else if (choice == 3) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 선택입니다.");
				continue;
			}
		}
	}

	private static void showMenu() {
		System.out.println("1. 데이터 입력");
		System.out.println("2. 저장된 전화번호부 보기");
		System.out.println("3. 종료");
		System.out.print("선택>>");
	}
}
