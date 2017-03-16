class Box9 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	
	public Box9(int _width, int _height, int _depth) {
		width = _width;
		height = _height;
		depth = _depth;
		volume();
	}
	
	private void volume(){
		vol = width * height * depth;
	}
	
	public int getVolume(){
		return vol;
	}
}
public class Box9Test1 {
	public static void main(String[] args) {
		Box9 myBox1 = new Box9(10, 20, 30);
		System.out.println("ボックスの体積："+myBox1.getVolume());
	}
}
