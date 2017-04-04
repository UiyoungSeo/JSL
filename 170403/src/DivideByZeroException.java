import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;

		try {
			System.out.print("dividend : ");
			x = sc.nextInt();
			System.out.print("diviosr : ");
			y = sc.nextInt();
			int result = x / y;
			System.out.println("division result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("can't divide by zero");
		} catch (InputMismatchException e) {
			System.out.println("please input proper number");
		} finally {
			System.out.println("end");
		}
	}
}
