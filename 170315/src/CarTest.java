class Car{
	private String colour;
	private String gearType;
	private int door;
	
	public Car(){
		this("white", "auto", 4);
	}
	
	public Car(String _colour, String _gearType, int _door) {
		colour = _colour;
		gearType = _gearType;
		door = _door;
	}
	
	public String getColour(){
		return colour;
	}
	
	public String getGearType(){
		return gearType;
	}
	
	public int getDoor(){
		return door;
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car("白", "自動", 4);
		Car c2 = new Car("青", "手動", 4);
		
		System.out.println("c1の色："+c1.getColour()+"ギアタイプ："+c1.getGearType()+"ドア数："+c1.getDoor());
		System.out.println("c2の色："+c2.getColour()+"ギアタイプ："+c2.getGearType()+"ドア数："+c2.getDoor());
	}
}
