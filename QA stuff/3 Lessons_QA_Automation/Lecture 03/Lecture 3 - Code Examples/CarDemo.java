package lesson03;

public class CarDemo {
	public static void main(String[] args) {
		Car bmw = new Car();
		Car golf;
		golf = new Car();
		
		golf.model = "VW Golf 1";
		golf.maxSpeed = 200;
		golf.color = "Blue";
		golf.gear = 1;
		golf.currentSpeed = 0;
		
		Person nikola = new Person();
		nikola.name = "Nikola Kamenov";
		nikola.age = 23;
		
		golf.owner = nikola;
		
		Person ivan = new Person();
		ivan.name = "Ivan";
		golf.owner = ivan;
		
		System.out.println("The owner of the golf is " + golf.owner.name);
		
		
//		
//		
//		
//		
//		
//		
//		
//		System.out.println("Max speed of " + golf.model + " is " + golf.maxSpeed);
//		bmw.maxSpeed = 300;
//		
//		if (bmw.maxSpeed > golf.maxSpeed) {
//			System.out.println("The BMW is faster");
//		} else {
//			System.out.println("The VW is faster");
//		}
	}
}
