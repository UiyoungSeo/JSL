import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		System.out.print("첫 번째 정수를 입력 : ");
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력 : ");
		int second = sc.nextInt();

		double average1 = (first + second) / 2;
		System.out.println("정수연산 : 평균은 (" + first + "/" + second + ")/2=" + average1 + " 입니다.");

		double average2 = (first + second) / 2.0;
		System.out.println("실수연산 : 평균은 (" + first + "/" + second + ")/2=" + average2 + " 입니다.");
		
	}
}
