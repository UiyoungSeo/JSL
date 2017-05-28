class OIa {
	public void show(String str) {
		System.out.println("부모 클래스의 메서드 show(String str) 수행, " + str);
	}
}

class OIb extends OIa {
	public void show() {
		System.out.println("자식 클래스의 메서드 show() 수행");
	}
}

public class OverridingTest1 {
	public static void main(String[] args) {
		OIb oIb = new OIb();
		oIb.show("처음 시작하는 자바");
		oIb.show();
	}
}
