class SD1 {
	public int i1;
	public double d1;

	public SD1(int _i1) {
		System.out.println("SD1(int _i1) 생성자 수행");
		i1 = _i1 * _i1;
		System.out.println(i1 + "의 2제곱은 :" + i1);
	}

	public SD1(double _d1) {
		System.out.println("SD1(double _d1) 생성자 수행");
		d1 = _d1 * _d1;
		System.out.println(d1 + "의 2제곱은 :" + this.d1);
	}
}

class Sub1 extends SD1 {
	public Sub1(int _i1) {
		super(_i1);
		System.out.println("Sub1(int _i1) 생성자 수행");
		i1 *= _i1;
		System.out.println(i1 + "의 3제곱은 :" + i1);
	}

	public Sub1(double _d1) {
		super(_d1);
		System.out.println("Sub1(double _d1) 생성자 수행");
		d1 *= _d1;
		System.out.println(d1 + "의 3제곱은 :" + d1);
	}
}

public class SuperTest3 {
	public static void main(String[] args) {
		Sub1 sub1 = new Sub1(10);
		Sub1 sub2 = new Sub1(10.5);
	}
}
