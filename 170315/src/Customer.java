class Customer1 {
	int age;

	public Customer1() {
		this(17);
	}

	public Customer1(int _age) {
		age = _age;
		System.out.println("Customer1 classが作られました。");
		System.out.println("年は:" + age);
	}

	public void greeting() {
		System.out.println("こんにちは");
	}
}

public class Customer {
	public static void main(String[] args) {
		Customer1[] customer = new Customer1[2];
		customer[0] = new Customer1();
		customer[1] = new Customer1(25);
	}
}
