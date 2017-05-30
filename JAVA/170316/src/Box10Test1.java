class Box10 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	private long idNumber;
	private static long boxID = 0;

	public Box10(int _width, int _height, int _depth) {
		width = _width;
		height = _height;
		depth = _depth;
		idNumber = ++boxID;
		volume();
	}

	private void volume() {
		vol = width * height * depth;
	}
	
	public int getVolume(){
		return vol;
	}
	
	public static long getCurrentID() {
		return boxID;
	}

}

public class Box10Test1 {

	public static void main(String[] args) {
		Box10[] myBox = new Box10[5];
		for (int i = 0; i < myBox.length; i++) {
			myBox[i] = new Box10(i+1, i+2, i+3);
			System.out.println((i+1)+"番目のボックスの体積："+myBox[i].getVolume());
		}
		System.out.println("最後に作られたボックスの番号は："+Box10.getCurrentID());
	}

}
