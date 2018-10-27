class Food {
	private int price;

	public Food(int _price) {
		price = _price;
	}

	public int getPrice() {
		return price;
	}
}

class Takoyaki extends Food {
	public Takoyaki() {
		super(250);
	}

	@Override
	public String toString() {
		return "たこ焼き";
	}
}

class Oyakodon extends Food {
	public Oyakodon() {
		super(450);
	}

	@Override
	public String toString() {
		return "親子丼";
	}
}

class Udong extends Food {
	public Udong() {
		super(500);
	}

	@Override
	public String toString() {
		return "うどん";
	}
}

class Buyer {
	private int money;

	public Buyer(int _money) {
		money = _money;
	}

	public void buy(Food food, int amount) {
		System.out.println(food + "を" + amount + "つ食べました。");
		money -= food.getPrice() * amount;
		System.out.println("今残ったお金 : " + money + "円");
		System.out.println();
	}
}

public class PolymorphismTest2 {
	public static void main(String[] args) {
		Buyer me = new Buyer(5000);
		me.buy(new Udong(), 3);
		me.buy(new Oyakodon(), 4);
		me.buy(new Takoyaki(), 2);
	}
}
