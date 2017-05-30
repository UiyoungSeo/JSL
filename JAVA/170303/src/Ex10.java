import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		
		System.out.println(num%3);
		
		switch (num % 3) {
		case 0:
			System.out.println("가위를 선택하셨습니다.");
			break;
		case 1:
			System.out.println("바위를 선택하셨습니다.");
			break;
		case 2:
			System.out.println("보를 선택하셨습니다.");
			break;

		default:
			break;
		}
	}

}
