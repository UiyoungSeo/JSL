import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 99까지의 정수를 입력 >> ");

		int num = sc.nextInt();
		int res = 0;
		int clap = 0;
		if (num >= 1 && num <= 99) {
			res = num % 10;
			if (res == 3 || res == 6 || res == 9)
				clap++;
			res = num / 10;
			if (res == 3 || res == 6 || res == 9)
				clap++;

			System.out.println(clap);

		} else
			System.out.println("1부터 99까지의 정수를 입력해 주세요");
	}

}
