class D1 {
	public int x = 1000;

	public void display() {
		System.out.println("부모 클래스 D1의 display() 메서드 입니다.");
	}
}

class D2 extends D1 {
	public int x = 2000;

	@Override
	public void display() {
		System.out.println("자식 클래스 D2의 display() 메서드 입니다.");
	}

	public void write() {
		display();
		super.display();
		System.out.println("D2 클래스 객체의 x 값은 " + x);
		System.out.println("D1 클래스 객체의 x 값은 " + super.x);
	}
}

public class SuperTest2 {
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.write();
	}
}
