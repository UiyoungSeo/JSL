import java.awt.Shape;

abstract class Figure1 {
	abstract void draw();
}

interface Shape1 {
	public void computeArea(double a, double b);
}

class Triangle3 extends Figure1 implements Shape1 {
	@Override
	public void computeArea(double a, double b) {
		System.out.println("삼각형의 넓이 : " + (a * b / 2));
	}

	@Override
	void draw() {
		System.out.println("삼각형을 그리는 기능");
	}
}

class Rectangle3 extends Figure1 implements Shape1{
	@Override
	public void computeArea(double a, double b) {
		System.out.println("사각형의 넓이 " + a*b);
	}

	@Override
	void draw() {
		System.out.println("사각형을 그리는 기능");
	}
}

class PolyDraw1 {
	public void pdraw(Figure1 figure1){
		figure1.draw();
	}
	
	public void pComputeArea(Shape1 s, double a, double b){
		s.computeArea(a, b);
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		PolyDraw1 p = new PolyDraw1();
		Figure1 fg1 = new Triangle3();
		Figure1 fg2 = new Rectangle3();
		Shape1 sp1 = new Triangle3();
		Shape1 sp2 = new Rectangle3();
		p.pdraw(fg1);
		p.pComputeArea(sp1, 4, 4);
		p.pdraw(fg2);
		p.pComputeArea(sp2, 4, 4);
	}
}
