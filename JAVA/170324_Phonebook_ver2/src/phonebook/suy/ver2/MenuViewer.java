package phonebook.suy.ver2;

import java.util.Scanner;

public class MenuViewer {
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("<MENU> 1. 전화번호 입력 / 2. 전화번호부 보기 / 3. 이름 검색 / 4. 데이터 삭제 / 5.종료");
		System.out.print("선택>>");
	}
}
