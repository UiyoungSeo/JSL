package phonebook.answer.ver2;

import java.util.Scanner;

public class MenuViewer {
	Scanner sc = new Scanner(System.in);

	public void showMenu() {
		int choice;
		PhonebookManager pm = new PhonebookManager();

		while (true) {
			System.out.println("<MENU> 1. 데이터 입력 / 2. 데이터 검색 / 3. 데이터 삭제 / 4.종료");
			System.out.print("선택>>");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				pm.inputData();
				break;
			case 2:
				pm.searchData();
				break;
			case 3:
				System.out.println("삭제");
				break;
			case 4:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("번호를 다시 선택하세요");
				break;
			}
		}
	}
}
