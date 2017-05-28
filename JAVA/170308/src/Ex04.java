import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int[] inum = { 8, 7, 3, 5, 83, 2, 98, 6, 2 };

		Scanner sc = new Scanner(System.in);
		System.out.print("찾고 싶은 숫자 입력 >>");
		int input = sc.nextInt();
		int count = 0;

		for (int i = 0; i < inum.length; i++) {
			if (inum[i] == input) {
				count++;
				System.out.println(i + "번쨰 데이터와 일치");
			}
		}
		if (count == 0)
			System.out.println("일치하는 데이터가 없습니다.");
		else
			System.out.println(count + "개의 데이터를 찾았습니다.");

	}

}
