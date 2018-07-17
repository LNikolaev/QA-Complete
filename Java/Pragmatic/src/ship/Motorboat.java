package ship;

public class Motorboat {
	private int year;
	private int price;
	
	public Motorboat(int year, int price) {
		super();
		this.year = year;
		this.price = price;
	}
	
	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	void leaveShip(Ship ship) {
		System.out.printf("motorboat leave ship[%s].\n", ship.getName());
	}
	void getInShip(Ship ship) {
		System.out.printf("motorboat get in ship[%s].\n", ship.getName());
	}
}
