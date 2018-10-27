
public class Ex03 {

	public static void main(String[] args) {
		int sum = 0, count = 1;

		do {
			sum += count;
			count++;
		} while (count <= 10);
		System.out.println("sum of 1~10 : " + sum);
	}

}
