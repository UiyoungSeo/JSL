import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		while (true) {
			int com = (int) ((Math.random() * 3)); // 0:가위 1:바위 2:보
			System.out.print("가위 바위 보! >> ");

			Scanner sc = new Scanner(System.in);

			String user = sc.next();

			switch (com) {
			case 0:
				System.out.println("com은 가위를 냈다!");

				if (user.equals("바위"))
					System.out.println("졌습니다.");
				else if (user.equals("보"))
					System.out.println("이겼습니다.");
				else
					System.out.println("비겼습니다.");

				break;
			case 1:
				System.out.println("com은 바위를 냈다!");

				if (user.equals("가위"))
					System.out.println("졌습니다.");
				else if (user.equals("보"))
					System.out.println("이겼습니다.");
				else
					System.out.println("비겼습니다.");

				break;
			case 2:
				System.out.println("com은 보를 냈다!");

				if (user.equals("가위"))
					System.out.println("이겼습니다.");
				else if (user.equals("바위"))
					System.out.println("졌습니다.");
				else
					System.out.println("비겼습니다.");

				break;

			default:
				System.out.println("hi");
				break;
			}
		}
	}
}
