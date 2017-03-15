class Car2 {
	String colour;
	String gearType;
	int door;

	public Car2() {
		this("white", "auto", 4);
	}

	public Car2(Car2 c) {
		this(c.colour, c.gearType, c.door);
	}

	public Car2(String _colour, String _gearType, int _door) {
		colour = _colour;
		gearType = _gearType;
		door = _door;
	}
}

public class CarTest2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(c1);

		System.out.println("c1の色：" + c1.colour + " gear type : " + c1.gearType + " door :" + c1.door);
		System.out.println("c2の色：" + c2.colour + " gear type : " + c2.gearType + " door :" + c2.door);

		c1.door = 100;
		System.out.println("c1.door=100; 修行の後");
		System.out.println("c1の色：" + c1.colour + " gear type : " + c1.gearType + " door :" + c1.door);
		System.out.println("c2の色：" + c2.colour + " gear type : " + c2.gearType + " door :" + c2.door);
	}
}
