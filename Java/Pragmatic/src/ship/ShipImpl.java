package ship;

public class ShipImpl {

	public static void main(String[] args) {
		Ship bigShip = new Ship(230, 50, "Shark", 2013, 550000, new Motorboat(2017, 44000));
		Ship smallShip = new Ship(150, 30, "Gold Fish", 2016, 380000, new Motorboat(2018, 67000));

		bigShip.getMotorboat().leaveShip(bigShip);
		bigShip.getMotorboat().getInShip(bigShip);
		smallShip.getMotorboat().leaveShip(smallShip);
		smallShip.getMotorboat().getInShip(smallShip);
		bigShip.moveFast();
		smallShip.moveFast();
		bigShip.moveSlow();
		smallShip.moveSlow();
		bigShip.parkOnCoast();
		smallShip.parkOnCoast();

		Ship.printInfo(bigShip);
		System.out.println("---------------");
		Ship.printInfo(smallShip);
	}

}
