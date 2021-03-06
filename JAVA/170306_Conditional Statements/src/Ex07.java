import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		int num = (int) (Math.random() * 100 + 1);
		int min = 1, max = 100;
		int count = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("input 1 to 100 >>");
		int input = sc.nextInt();

		if (input >= 1 && input <= 100) {
			do {
				if (input < num) {
					System.out.println("more than " + input);
					if (min < input)
						min = input;
				} else if (input > num) {
					System.out.println("less than " + input);
					if (max > input)
						max = input;
				}
				System.out.println("hint : " + min + "~" + max);
				System.out.println();

				System.out.print(">>");
				input = sc.nextInt();
				count++;
			} while (input != num);

			System.out.println("you got it in "+count+" tries ! The answer was " + num);
		} else
			System.out.println("out of range");
	}
}
