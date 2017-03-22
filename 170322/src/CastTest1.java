class Rectangle4 {
	private int width;
	private int height;

	public Rectangle4(int _width, int _height) {
		width = _width;
		height = _height;
	}

	public int computeRectangleArea() {
		return width * height;
	}
}

class Cube4 extends Rectangle4 {
	private int depth;
	public Cube4(int _width, int _height, int _depth){
		super(_width, _height);
		depth= _depth;
	}
	public int computeCubeArea(){
		return super.computeRectangleArea() * depth;
	}
}

public class CastTest1 {
	public static void main(String[] args) {
		Rectangle4 r = new Cube4(10, 20, 30);
		System.out.println("넓이는 "+r.computeRectangleArea());
		//System.out.println("넓이는 " + r.computeCubeArea()); //Error! 자식클래스의 메서드호출 불가능
		//Cube4 c = new Rectangle4(10, 20);	//Error! 자식클래스의 객체 변수에 상위 클래스의 객체 배정 불가능	
	}
}
