import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("철수 : ");
			String chulsu = sc.next();

			System.out.print("영희 : ");
			String younghee = sc.next();

			if (chulsu.equals("가위")) {
				if (younghee.equals("바위"))
					System.out.println("영희가 이겼습니다.");
				else if (younghee.equals("보"))
					System.out.println("철수가 이겼습니다.");
			} else if (chulsu.equals("바위")) {
				if (younghee.equals("가위"))
					System.out.println("철수가 이겼습니다.");
				else if (younghee.equals("보"))
					System.out.println("영희가 이겼습니다.");
			} else if (chulsu.equals("보")) {
				if (younghee.equals("가위"))
					System.out.println("영희가 이겼습니다.");
				else if (younghee.equals("바위"))
					System.out.println("철수가 이겼습니다.");
			} else
				System.out.println("가위,바위,보 를 입력해주세요");

			if (chulsu.equals(younghee)) {
				System.out.println("비겼습니다.");
			}

		}
	}
}
