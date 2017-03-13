import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {

		System.out.print("금액을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();

		int fiftyThousand = money / 50000;
		int tenThounsand = (money % 50000) / 10000;
		int fiveThousand = ((money % 50000) % 10000) / 5000;
		int thousand = (((money % 50000) % 10000) % 5000) / 1000;
		int fiveHundred = ((((money % 50000) % 10000) % 5000) % 1000) / 500;
		int hundred = (((((money % 50000) % 10000) % 5000) % 1000) % 500) / 100;

		System.out.println(money + "원은");
		System.out.println("오만원권 " + fiftyThousand + "장, " + "만원권 " + tenThounsand + "장, " + "오천원권 " + fiveThousand
				+ "장, 천원권 " + thousand + "장, 오백원 " + fiveHundred + "개, 백원 " + hundred + "개 입니다.");

	}
}
