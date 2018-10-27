import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		System.out.print("何月？ : ");
		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();

		if (month >= 3 && month <= 5)
			System.out.println("春");
		else if (month >= 6 && month <= 8)
			System.out.println("夏");
		else if (month >= 9 && month <= 11)
			System.out.println("가을");
		else if (month == 1 || month == 2 || month == 12)
			System.out.println("冬");
		else
			System.out.println("해당되는 계절이 없습니다.");
	}

}
