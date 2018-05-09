package lesson06;

public class Car {
	String model;
	double maxSpeed;
	double currentSpeed;
	String color;
	int gear;
	Person owner;
	double price;
	boolean isSportCar;
	
	Car() {
		
	}
	
	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
		gear = 1;
		currentSpeed = 0;
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed) {
		this(model, isSportCar, color);
		this.price = price;
		if(!isSportCar && maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
	
	Car(String model, boolean isSportCar, String color, double price, double maxSpeed, double currentSpeed) {
		this(model, isSportCar, color, price, maxSpeed);
		this.currentSpeed = currentSpeed;
	}
	
	Car(String model) {
		this.model = model;
	}
	
	boolean isMoreExpensive(Car carToCompare) {
		if( this.price > carToCompare.price ){
			return true;
		} else {
			return false;
		}
	}
	
	void changeOwner(Person newOwner) {
		owner = newOwner;
		newOwner.car = this;
	}
	
	double calculateCarPriceForScrap(double metalPrice) {
		double coef = 0.2;
		if (isSportCar) {
			coef += 0.05;
		}
		if (color.equalsIgnoreCase("Black") || color.equalsIgnoreCase("White")) {
			coef += 0.05;
		}
		
		return coef * metalPrice;
	}
	
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
	
	void changeGearDown() {
		if(gear == 1) {
			System.out.println("Tha min gear is 1.");
		} else {
			gear--;
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
