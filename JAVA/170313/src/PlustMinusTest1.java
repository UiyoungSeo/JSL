public class PlustMinusTest1 {
	public static void main(String[] args) {
		PlusMinus obj1 = new PlusMinus();
		String sum, minus;
		sum = obj1.plus(50, 30);
		minus = obj1.minus(50, 30);
		
		System.out.println(sum);
		System.out.println(minus);
	}
}
