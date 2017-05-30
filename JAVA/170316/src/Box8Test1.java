class Box8 {
	int width;
	int height;
	int depth;

	public Box8(int _width, int _height, int _depth) {
		width = _width;
		height = _height;
		depth = _depth;
	}

	int volume() {
		return width * height * depth;
	}

}

public class Box8Test1 {
	public static void main(String[] args) {
		Box8 myBox1 = new Box8(10, 20, 30);
		//myBox1.width = 20;
		System.out.println("ボックスの体積："+ myBox1.volume());
	}
}
