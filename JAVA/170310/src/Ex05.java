
public class Ex05 {

	public static void main(String[] args) {
		String[] str = { "박수 한번", "박수 두번" };

		int res, num, numberOf369 = 0;
		for (int i = 1; i < 100; i++) {
			num = i;

			for (res = num % 10; num > 0; res = num % 10) {
				if (res == 3 || res == 6 || res == 9)
					numberOf369++;
				num /= 10;	
				//num = num/10;
			}

			if (numberOf369 > 0)
				System.out.println(i + str[numberOf369 - 1]);
			numberOf369 = 0;
		}
	}

}
