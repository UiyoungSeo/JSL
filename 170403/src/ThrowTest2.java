class Test2 {
	public void aa() throws Exception {
		bb();
	}

	public void bb() throws Exception {
		throw new Exception();
	}
}

public class ThrowTest2 {
	public static void main(String[] args) {
		Test2 t2 = new Test2();
		try {
			t2.aa();
		} catch (Exception e) {
			System.out.println("exception!");
			e.printStackTrace();
		}
	}
}
