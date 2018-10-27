class A {
	public int aa = 1;
}

class B extends A {
	private int bb = 2;

	public int bb() {
		return bb;
	}
}

class C extends B {
	int cc = 3;
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		C object = new C();
		System.out.println("object객체의 속성 변수 aa 의 값은 " + object.aa);
		System.out.println("object객체의 속성 변수 bb 의 값은 " + object.bb());
		System.out.println();
		System.out.println("object 객체의 객체속성변수 cc 의 값은 " + object.cc);
	}
}
