import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("size of array >> ");
		int arrayLength = sc.nextInt();
		double[] dnum = new double[arrayLength];
		double sum = 0;

		for (int i = 0; i < arrayLength; i++) {
			System.out.print(i + "번째 데이터 입력 >>");
			dnum[i] = sc.nextDouble();
			sum += dnum[i];
		}

		System.out.println("입력한 배열 : " + Arrays.toString(dnum));
		System.out.println("배열의 합 : " + sum);
		System.out.println("배열의 평균 : " + sum / arrayLength);

	}

}
