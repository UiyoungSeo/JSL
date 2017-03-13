import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int[] score = new int[5];
		System.out.print("점수 다섯개를 입력 >> ");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}

		int max = score[0];
		int min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
			else if (score[i] < min)
				min = score[i];
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);

	}

}
