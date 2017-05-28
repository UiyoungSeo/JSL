abstract class Figure {
	abstract public void draw();
}

class Triange2 extends Figure {
	@Override
	public void draw() {
		System.out.println("다형성 : 삼각형을 그린다.");
	}
}

class Rectangle2 extends Figure {
	@Override
	public void draw() {
		System.out.println("다형성 : 사각형을 그린다.");
	}
}

class Oval2 extends Figure {
	@Override
	public void draw() {
		System.out.println("다형성 : 타원을 그린다.");
	}
}

class PolyDraw {
	public void pDraw(Figure f) {
		f.draw();
	}
}

public class AbstractTest2 {
	public static void main(String[] args) {
		PolyDraw p = new PolyDraw();
		Figure f1 = new Triange2();
		Figure f2 = new Rectangle2();
		Figure f3 = new Oval2();
		p.pDraw(f1);
		p.pDraw(f2);
		p.pDraw(f3);
	}
}
