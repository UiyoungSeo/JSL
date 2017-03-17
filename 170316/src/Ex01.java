import java.util.Scanner;

class Calculator {
	private double x;
	private double y;
	private String operator;
	private double result;

	public Calculator(double _x, double _y, String _operator) {
		x = _x;
		y = _y;
		operator = _operator;
		operate();
	}

	private void operate() {
		switch (operator) {
		case "+":
			result = x + y;
			break;
		case "-":
			result = x - y;
			break;
		case "*":
			result = x * y;
			break;
		case "/":
			result = x / y;
			break;

		default:
			System.out.println("잘못된 입력");
			break;
		}
	}

	public double getResult() {
		return result;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("두 정수와 한개의 연산자를 입력하시오 >>");
			Calculator myCal = new Calculator(sc.nextDouble(), sc.nextDouble(), sc.next());
			System.out.println("result:" + myCal.getResult());
		}
	}
}
