import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("******* multiplication table ******* \n");

		for (int i = 1; i <= 9; i++) {
			System.out.println();
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");
			}
		}
	}

}
