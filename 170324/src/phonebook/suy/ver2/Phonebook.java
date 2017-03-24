package phonebook.suy.ver2;

import java.util.Scanner;

public class Phonebook {
	static Scanner sc = new Scanner(System.in);
	static PhonebookManager phonebookManager = new PhonebookManager();
	
	public static void main(String[] args) {
		int choice = 0;

		while (choice != 5) {
			MenuViewer.showMenu();
			choice = MenuViewer.keyboard.nextInt();
			switch (choice) {
			case 1:
				phonebookManager.inputData();
				break;
			case 2:
				phonebookManager.showList();
				break;
			case 3:
				phonebookManager.searchData();
				break;
			case 4:
				phonebookManager.deleteData();
				break;
			case 5:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 선택");
				break;
			}
		}
	}
}
