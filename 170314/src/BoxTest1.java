class Box1 {
	int width;
	int height;
	int depth;

	public Box1(int _width, int _height, int _depth) {
		width = _width;
		height = _height;
		depth = _depth;
	}
}

public class BoxTest1 {
	public static void main(String[] args) {
		Box1 myBox1 = new Box1(78, 145, 87);
		Box1 myBox2 = new Box1(48, 45, 137);
		int volume1, volume2;

		volume1 = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println("一番目のボックスの体積は：" + volume1);
		volume2 = myBox2.width * myBox2.height * myBox2.depth;
		System.out.println("二番目のボックスの体積は：" + volume2);
	}
}
