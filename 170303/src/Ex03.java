import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.print("input your score : ");
		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();

		System.out.println(score >= 90 ? "A" : "B");

	}

}
