class Box11{
	private int intVolume;
	private double doubleVolume;
	
	public Box11(int width, int height, int depth) {
		volume(width, height, depth);
	}
	public Box11(double width, double height, double depth) {
		volume(width, height, depth);
	}
	
	private void volume(int width, int height, int depth){
		intVolume = width * height * depth;
	}
	private void volume(double width, double height, double depth){
		doubleVolume = width * height * depth;
	}
	
	public int getIntVolume(){
		return intVolume;
	}
	
	public double getDoubleVolume(){
		return doubleVolume;
	}
}
public class Box1Test1 {
	public static void main(String[] args) {
		Box11 myBox1 = new Box11(10, 20, 30);
		System.out.println("ボックスの体積(정수)："+myBox1.getIntVolume());
		
		myBox1 = new Box11(10.5, 20.5, 30.5);
		System.out.println("ボックスの体積(실수)："+myBox1.getDoubleVolume());
		
		myBox1 = new Box11(10, 20, 30.5);	//정수10, 20이 10.0 20.0으로 자동형변환
		System.out.println("ボックスの体積(정수, 실수 혼합)："+myBox1.getDoubleVolume());
	}

}
