import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// Lotto 1~45, 중복x, 여섯 개,보너스 1

		while (true) {

			int[] lottoNumber = new int[6];

			for (int i = 0; i < lottoNumber.length; i++) {
				lottoNumber[i] = (int) (Math.random() * 45 + 1);

				for (int j = 0; j < i; j++) {
					if (lottoNumber[i] == lottoNumber[j]) {
						i--;
						break;
					}
				}
			}
			Arrays.sort(lottoNumber);
			System.out.println(Arrays.toString(lottoNumber));
			
			Scanner sc = new Scanner(System.in);
			System.out.println("계속? y/n");
			if(sc.next() == "n")
				break;
		}
	}
}
