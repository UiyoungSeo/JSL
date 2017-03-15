class Box5 {
	int width;
	int height;
	int depth;

	public Box5(int _width, int _height, int _depth) {
		width = _width;
		height = _height;
		depth = _depth;
	}

	public Box5() {
		this(1, 1, 1);
	}

	public Box5(int _width) {
		this(_width, 1, 1);
	}

	public Box5(int _width, int _height) {
		this(_width, _height, 1);
	}

	public int volume() {
		return width * height * depth;
	}
}

public class Box5Test1 {
	public static void main(String[] args) {
		Box5[] myBox = new Box5[4];
		myBox[0] = new Box5();
		myBox[1] = new Box5(10);
		myBox[2] = new Box5(10, 20);
		myBox[3] = new Box5(10, 20, 30);

		for (int i = 0; i < myBox.length; i++) {
			System.out.println("myBox[" + i + "]の体積： " + myBox[i].volume());
		}
	}
}
