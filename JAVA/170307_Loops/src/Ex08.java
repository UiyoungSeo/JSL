import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// 다섯개의 정수를 입력받아서 그것의 합을 구하시오 

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 다섯개를 입력하세요 >>");
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if (n < 0)
				continue;
			sum += n;
		}

		System.out.println("sum : " + sum);
	}

}
