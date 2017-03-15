import java.util.Scanner;

class Goods {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;

	public Goods() {
		this("名無し", 0, 0, 0);
	}

	public Goods(String _name, int _price, int _numberOfStock, int _sold) {
		name = _name;
		price = _price;
		numberOfStock = _numberOfStock;
		sold = _sold;

		System.out.println(_name + "が作られました。");
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getNumberOfStock() {
		return numberOfStock;
	}

	public int getSold() {
		return sold;
	}
}

public class GoodsArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Goods[] good = new Goods[3];
		for (int i = 0; i < good.length; i++) {
			System.out.println((i + 1) + "目の商品の名前、価格、在庫, 売られた数を入力してください。");
			good[i] = new Goods(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		}

		System.out.println("────商品リスト────");
		System.out.println("商品名\t 価格\t 在庫\t 売られ多数");
		for (int i = 0; i < good.length; i++) {
			System.out.print(good[i].getName() + "\t");
			System.out.print(good[i].getPrice() + "\t");
			System.out.print(good[i].getNumberOfStock() + "\t");
			System.out.println(good[i].getSold());
		}
	}
}
