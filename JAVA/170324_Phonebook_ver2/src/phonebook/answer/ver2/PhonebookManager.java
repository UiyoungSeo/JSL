package phonebook.answer.ver2;

import java.util.Scanner;

class PhonebookManager {
	final int MAX_COUNT = 10;
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_COUNT];
	Scanner sc = new Scanner(System.in);
	int count = 0;

	public void inputData() {
		System.out.print("이름>>");
		String name = sc.next();
		System.out.print("전화번호>>");
		String phoneNumber = sc.next();
		sc.nextLine();
		System.out.print("생년월일>>");
		String birthDate = sc.nextLine();

		infoStorage[count++] = new PhoneInfo(name, phoneNumber, birthDate);
	}

	public void searchData() {
		System.out.print("검색할 이름>>");
		String name = sc.next();
		int dataIndex = search(name);
		if (dataIndex < 0)
			System.out.println(name + " 데이터가 없습니다.");
		else
			infoStorage[dataIndex].showInfo();
	}

	private int search(String name) {
		for (int idx = 0; idx < count; idx++) {
			PhoneInfo p = infoStorage[idx];
			if (name.compareTo(p.getName()) == 0) {
				return idx;
			}
		}
		return -1;
	}
}