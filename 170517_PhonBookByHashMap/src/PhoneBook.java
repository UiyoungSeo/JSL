import java.util.Scanner;

public class PhoneBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneManager phoneManager = new PhoneManager();
		boolean isStop = false;

		System.out.println("---------------------------------------");
		System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장되지 않습니다.");
		System.out.println("---------------------------------------");
		
		do {
			phoneManager.showMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 0: // 삽입
				phoneManager.insert();
				break;
			case 1: // 삭제
				phoneManager.remove();
				break;
			case 2: // 찾기
				phoneManager.search();
				break;
			case 3: // 전체보기
				phoneManager.showAll();
				break;
			case 4: // 종료
				System.out.println("프로그램 종료");
				isStop = true;
				System.exit(0);
				break;
			default:
				System.out.println("잘못 선택했습니다.");
				break;
			}
		} while (!isStop);
	}
}
