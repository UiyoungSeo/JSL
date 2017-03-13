import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		System.out.print("input your name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();

		System.out.print("input your age:");
		int age = sc.nextInt();
		
		System.out.print("input your weight:");
		double weight = sc.nextDouble();

		System.out.println("your name is " + name + ", and you are " + age + " years old, and "+weight+"kg");

	}
}
