package ship;

public class Ship {
	private int length;
	private int width;
	private String name;
	private int year;
	private int price;
	private Motorboat motorboat;

	public Ship(int length, int width, String name, int year, int price, Motorboat motorboat) {
		super();
		this.length = length;
		this.width = width;
		this.name = name;
		this.year = year;
		this.price = price;
		this.motorboat = motorboat;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public int getPrice() {
		return price;
	}

	public Motorboat getMotorboat() {
		return motorboat;
	}

	void moveFast() {
		System.out.printf("The ship:[%s] is moving fast.%n", getName());
	}

	void moveSlow() {
		System.out.printf("The ship[%s] is moving slow.%n", getName());
	}

	void parkOnCoast() {
		System.out.printf("The ship[%s] parking on the coast.%n", getName());
	}

	static void printInfo(Ship ship) {
		System.out.println("Ship information: ");
		System.out.printf("Name: %s%nLength: %d%nWidth: %d%nYear: %d%nPrice: %d%nMotorboat---> Year[%d] Price[%d]%n",
				ship.getName(), ship.getLength(), ship.getWidth(), ship.getYear(), ship.getPrice(),
				ship.getMotorboat().getYear(), ship.getMotorboat().getPrice());
	}
}