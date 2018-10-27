import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		System.out.print("input number : ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		System.out.println(num + "은 짝수입니까?");
		System.out.println((num % 2 == 0) ? true : false);

	}

}
