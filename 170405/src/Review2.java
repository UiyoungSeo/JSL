//1~100까지 1의자리 숫자가 3의배수이면 출력 3, 6, 9,13,16,19 ...
public class Review2 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(i%10 == 3 || i%10 == 6 || i%10 == 9)
				System.out.println(i);
		}
	}
}
