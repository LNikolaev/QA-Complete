package lesson03;

public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int gear;
	Person owner;
	
	void accelerate() {
		currentSpeed = currentSpeed + 10;
		System.out.println(currentSpeed);
	}
	
	void changeGearUp() {
		if(gear == 5) {
			System.out.println("Tha max gear is 5.");
		} else {
			gear++;
			System.out.println("Current gear is " + gear);
		}
	}
	
	void changeGear(int nextGear) {
		if(nextGear < 1 || nextGear > 5) {
			System.out.println("Sorry, choose gear between 1 and 5");
		} else {
			gear = nextGear;
		}
	}
	
	void changeColor(String newColor) {
		color = newColor;
		System.out.println("The new color is " + newColor);
	}
}
