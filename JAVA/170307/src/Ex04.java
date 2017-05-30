
public class Ex04 {

	public static void main(String[] args) {

		double price = 24; // $24
		double interest = 0.08;	//복리이자 8%
		double result = 0;

		for (int i = 1648; i <= 2017; i++) {
			price *= (1 + interest);
		}
		System.out.println(price);
	}

}
