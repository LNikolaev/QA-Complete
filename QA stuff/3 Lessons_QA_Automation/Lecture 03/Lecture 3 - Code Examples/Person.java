package lesson03;

public class Person {

	String name;
	int age;
	long personalID;
	boolean isMale;
	double weight;
	String address;
	Person friend;
	double drunkLiters;
	
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
		drunkLiters = drunkLiters + liter;
	}
	
	double drunkLitersTillNow(){
		return drunkLiters;
	}
}
