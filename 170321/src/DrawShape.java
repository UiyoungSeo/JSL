public class DrawShape {
	public static void main(String[] args) {
		Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100) };
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150, 150), 50);

		t.draw();
		c.draw();
	}
}

class Shape {
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x, y;

	public Point(int _x, int _y) {
		x = _x;
		y = _y;
	}

	public Point() {
		this(0, 0);
	}

	public String getXY() {
		return "{" + x + "," + y + "}";
	}
}

class Circle extends Shape {
	Point center;
	int r;

	public Circle() {
		this(new Point(0, 0), 100);
	}

	public Circle(Point _center, int _r) {
		center = _center;
		r = _r;
	}

	@Override
	void draw() {
		System.out.printf("[center=(%d %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];

	public Triangle(Point[] _p) {
		p = _p;
	}

	@Override
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}