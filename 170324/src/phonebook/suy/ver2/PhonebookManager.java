package phonebook.suy.ver2;

import java.util.Scanner;

public class PhonebookManager {
	Scanner sc = new Scanner(System.in);
	private int count;

	private static int MAX = 100;
	Person[] person = new Person[MAX];

	public void inputData() {
		if (count >= MAX) {
			System.out.println("더 이상 입력할 수 없습니다.");
			return;
		}
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("전화번호>>");
		String phoneNumber = sc.next();
		sc.nextLine();
		System.out.print("생년월일>>");
		String birthDate = sc.nextLine();

		person[count++] = new Person(name, phoneNumber, birthDate);
	}

	public void deleteData() {
		System.out.print("삭제할 이름을 입력해주세요 >>");
		String name = sc.next();
		int i = 0;
		for (i = 0; i < count; i++) {
			if (person[i].getName().compareTo(name) == 0) {
				// 배열 새로 만들어서 검색해서 인덱스 0부터 나온 배열 인덱스(i) 바로 앞까지(i-1) 복사하고
				// 그 다음 배열(i+1)도 복사한다.
				// count는 새로 만든 배열의 크기로 변경한다.
				Person[] person2 = new Person[MAX];

				// 맨 앞의 배열을 삭제한 경우
				if (i == 0) {
					for (int j = 0; j < count; j++) {
						person2[j] = person[j + 1];
					}
				}

				// 가운데 배열을 삭제한 경우
				if (i != 0 && i != count) {
					for (int j = 0; j < i; j++) {
						person2[j] = person[i];
					}
					for (int j = i + 1; j < person.length; j++) {
						person2[j - 1] = person[i + 1];
					}
				}

				person = person2;
				count--;
				System.out.println(name + " 데이터를 삭제했습니다.");
				System.out.println();
				return;
			}
		}
		if (i == count) {
			System.out.println(name + " 데이터를 찾을 수 없습니다.");
		}
	}

	public void searchData() {
		System.out.print("검색할 이름을 입력해주세요>>");
		String name = sc.next();
		int i = 0;
		for (i = 0; i < count; i++) {
			if (person[i].getName().compareTo(name) == 0) {
				person[i].showPersonInfo();
				break;
			}
		}
		if (i == count) {
			System.out.println("검색결과를 찾을 수 없습니다.");
		}
	}

	public void showList() {
		if (count == 0) {
			System.out.println("표시할 데이터가 없습니다.");
			return;
		}
		System.out.println("─────────저장된 전화번호 목록─────────");
		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + ") ");
			person[i].showPersonInfo();
		}
		System.out.println("────────────────────────────────────");
	}
}
