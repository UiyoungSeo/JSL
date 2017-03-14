import java.util.Scanner;

class Goods {
	String name;
	int price;
	int numberOfStock;
	int sold;

	public Goods(String _name, int _price, int _numberOfStock, int _sold) {
		name = _name;
		price = _price;
		numberOfStock = _numberOfStock;
		sold = _sold;
	}
}

public class GoodsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("商品の名前、価格、재고, 팔린 수를 입력하세요");
		Goods tv = new Goods(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

		System.out.println(tv.name);
	}
}
