//사과가 123개 바구니한개에 15개씩 담는다. 몇개바구니가 필요한가?

public class Review1 {
	public static void main(String[] args) {
		int apple = 123;
		int basketSize = 15;
		int result = 0;

		result = apple % basketSize > 0 ? apple / basketSize + 1 : apple / basketSize;

		System.out.println(result);
	}
}
