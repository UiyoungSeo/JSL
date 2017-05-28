import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 점수와 학년을 입력받아 60점이상 합격, 아니면 불합격
		// 4학년이라면 70점 이상이어야 합격

		System.out.print("input your score and school year: ");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		int year = sc.nextInt();

		if (score >= 60) {
			if (year != 4) {
				System.out.println("합격");
			} else if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else
			System.out.println("불합격");
	}
}
