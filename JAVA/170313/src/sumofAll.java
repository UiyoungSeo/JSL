import java.util.Scanner;

public class sumofAll {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("덧셈을 수행 할 두 개의 숫자를 입력 >>");

		int n = sc.nextInt();
		int m = sc.nextInt();

		Sum s = new Sum();
		System.out.println(n + "から" + m + "までの合：" + s.allSum(n, m));

	}
}
