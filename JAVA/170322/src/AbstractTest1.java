abstract class Shape {
	abstract void draw();

	abstract void computeArea(double a, double b);
}

class Triangle1 extends Shape {
	@Override
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}

	@Override
	void computeArea(double a, double b) {
		System.out.println("삼각형의 넓이 : " + (a * b / 2));
	}
}

class Rectangle1 extends Shape {
	@Override
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}

	@Override
	void computeArea(double a, double b) {
		System.out.println("사각형의 넓이 : " + a * b);
	}
}

public class AbstractTest1 {
	public static void main(String[] args) {
		Shape s = new Triangle1();
		s.draw();
		s.computeArea(5.0, 10.0);
		s = new Rectangle1();
		s.draw();
		s.computeArea(5.0, 10.0);
	}
}
