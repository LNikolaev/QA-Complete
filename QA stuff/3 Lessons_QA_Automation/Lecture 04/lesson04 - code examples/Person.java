package lesson06;

public class Person {

	String name;
	int age;
	long personalID;
	boolean isMale;
	double weight;
	String address;
	Person[] friends;
	double money;
	Car car;
	
	Person () {
		this.age = 0;
		this.weight = 4.0;
	}
	
	Person (int ageParam, String nameParam) {
		age = ageParam;
		name = nameParam;
	}
	
	Person(String name, long personalNumber, boolean isMale) {
		this();
		this.name = name;
		this.personalID = personalNumber;
		this.isMale = isMale;
		friends = new Person[3];
	}
	
	void buyCar(Car car) {
		if(money < car.price) {
			System.out.println("Sorry, not enought money!");
			return;
		}
		money -= car.price;
		car.changeOwner(this);
	}
	
	double cellCarForScrap() {
		if(car == null) {
			System.out.println("No car for sale");
			return money;
		}
		//else
		double price = car.calculateCarPriceForScrap(20);
		car = null;
		money = money + price;
		return money;
	}
	void eat() {
		System.out.println(name + " is eating...");
	}
	
	void walk() {
		System.out.println("Walking...");
	}
	
	void growUp() {
		System.out.println("Growing with one year");
		age++;
	}
	
	void drinkWater(double liter) {
		if(liter > 1) {
			System.out.println("Too much water for drinking...");
		} else {
			System.out.println("Drinking " + liter + "l water");
		}
	}
}
