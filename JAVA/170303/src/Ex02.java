import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		System.out.print("숫자 한개 입력 : ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num < 0)
			System.out.println(num + "은(는) 음수 입니다.");
		else
			System.out.println(num + "은(는) 양수 입니다.");
	}

}
