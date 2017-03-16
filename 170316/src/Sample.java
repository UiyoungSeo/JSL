
public class Sample {
	int count = 10;
	static int num = 20;

	public int sum(int x, int y) {
		return x + y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		int same;
		// same = count; //error:클래스메서드는 클래스 변수만 사용 가능
		same = num; // 사용 가능
		// same = sum(5,5); //error:클래스메서드에서는 클래스 메서드만 사용 가능
		same = mul(5, 5); // 사용 가능

		// 객체를 생성하면 사용 할 수 있다.
		Sample s = new Sample();
		same = Sample.num;
		same = s.count;
		same = s.sum(5, 5);
		same = Sample.mul(5, 5);
	}
}
