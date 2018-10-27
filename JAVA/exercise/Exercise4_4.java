
public class Exercise4_4 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		int sign = -1;

		for (int i = 1; sum < 100; i++) {
			sign *= -1;
			num = sign * i;
			sum += num;


		}
		System.out.println(num);
	}

}
