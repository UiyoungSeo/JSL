public class Goods {
	String name;
	int price;
	int sold;	//売られた数

	public static void main(String[] args) {
		Goods tv = new Goods();
		tv.name = "SONY TV";
		tv.price = 500000;
		tv.sold = 10;
		
		Goods camera = new Goods();
		camera.name = "Nikon Camera";
		camera.price = 450000;
		camera.sold = 5;
		
		System.out.println("商品の名 : " +tv.name);
				
	}

}
