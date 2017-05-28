import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.print("당신의 나이는? : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.print("하루에 몇 끼 식사? : ");
		int num = sc.nextInt();
		System.out.print("한끼 식사 값은? : ");
		int price = sc.nextInt();

		System.out.println("지금까지의 식사값은 " + price * num * age * 365 + "원 입니다.");
	}
}
