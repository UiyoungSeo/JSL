import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1;
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("input integer 1 to 100 >>");
		input = sc.nextInt();

		if (input >= 1 && input <= 99) {
			do {
				if (input > num)
					System.out.println("it's less than " + input);
				else if (input < num)
					System.out.println("it's more than " + input);
				
				System.out.print(">>");
				input = sc.nextInt();
			} while (num != input);

			System.out.println("You got it!");
		} else
			System.out.println("out of range");

	}

}
