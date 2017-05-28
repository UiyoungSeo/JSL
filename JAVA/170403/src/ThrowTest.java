class Test {
	public void aa() {
		bb();
	}

	public void bb() {
		try {
			throw new Exception();	//강제 에외 발생
		} catch (Exception e) {
			System.out.println("Exception throwed");
			e.printStackTrace();
		}
		System.out.println("bb() method");
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.aa();
	}
}
