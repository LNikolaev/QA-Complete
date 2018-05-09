package lesson03;

public class CarDemo2 {
	public static void main(String[] args) {
		Car opel = new Car();
		
		opel.model = "Opel Astra";
		opel.gear = 1;
		opel.color = "Black";
		opel.maxSpeed = 200;
		opel.currentSpeed = 0;
		
		opel.accelerate();
		opel.changeGearUp();
		opel.changeGearUp();
		opel.changeGearUp();
		opel.changeGearUp();
		opel.changeGearUp();
		opel.changeGearUp();
		opel.changeGearUp();
		opel.changeGearUp();
		
		opel.changeGear(2);
		opel.changeColor("Red");
		
	}
}
