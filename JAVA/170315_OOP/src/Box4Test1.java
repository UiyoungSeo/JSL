class Box4 {
	int width;
	int height;
	int depth;

	public Box4() {
		this(1, 2, 3);
	}

	public Box4(int _width, int _height, int _depth){
		width = _width;
		height = _height;
		depth = _depth;
	}
	
	public int Volume() {
		return width*height*depth;
	}
}

public class Box4Test1 {
	public static void main(String[] args) {
		Box4 myBox1 = new Box4();
		Box4 myBox2 = new Box4(10,20,30);
		
		System.out.println(myBox1.Volume());
		System.out.println(myBox2.Volume());
	}
}
