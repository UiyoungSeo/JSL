class Box2 {
	int width;
	int height;
	int depth;

	public Box2() {
		width = 10;
		height = 20;
		depth = 30;
	}
}

public class Box2Test1 {
	public static void main(String[] args) {
		int myint1 = 100;
		int myint2 = myint1;
		System.out.println("첫 번째 값 : " + myint1 + " 두 번째 값 : " + myint2);

		myint1 = 200;
		System.out.println("첫 번째 값 : " + myint1 + " 두 번째 값 : " + myint2);

		Box2 myBox1 = new Box2();
		Box2 myBox2 = new Box2();
		myBox1.width = 20;
		myBox2.depth = 123;
		System.out.println("myBox1.width : " + myBox1.width);
		System.out.println("myBox1.height : " + myBox1.height);
		System.out.println("myBox1.depth : " + myBox1.depth);

		Box2 myBox3 = myBox2;
		myBox2.width = 1000;
		myBox2.height = 2000;
		System.out.println("myBox3.width : " + myBox3.width);
		System.out.println("myBox2.height : " + myBox3.height);
		System.out.println("myBox3.depth : " + myBox3.depth);

	}
}
