import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		int num = 0;
		boolean flag = true;
		int sum = 0;

		while (flag) {
			System.out.print(">>");
			num = sc.nextInt();

			if (num != 0)
				sum += num;
			else
				flag = false;
		}
		System.out.println(sum);
	}

}
