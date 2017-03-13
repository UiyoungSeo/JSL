import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] score = new int[4][5];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				score[i][j] = ran.nextInt(10);
			}
		}

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int x : score[i]) {
				System.out.print(x+" ");
				sum += x;
			}
			System.out.println("의 합계는 " + sum);
		}
	}

}
