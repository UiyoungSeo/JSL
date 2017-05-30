import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.print("input your grade : ");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		if (score >= 80) {
			System.out.println("우수 학점군에 속합니다.");

			if (score >= 90)
				System.out.println("A학점 입니다.");
			else
				System.out.println("B학점 입니다.");
		} else if (score >= 60) {
			System.out.println("보통 학점군에 속합니다.");
			if (score >= 70)
				System.out.println("C학점 입니다.");
			else
				System.out.println("D학점 입니다.");
		} else {
			System.out.println("F");
		}

	}
}