package lesson03;

import java.sql.Driver;

public class PersonDemo {
	public static void main(String[] args) {
		Person ivan = new Person();
		Person maria = new Person();
		Person ani = new Person();
		
		
		ani.age = 20;
		ani.personalID = 900329847;
		ani.name = "Andjelina";
		
		//System.out.println("The name of Ani is: " + ani.name + " and she has"
		//		+ " personal nuber " + ani.personalID);
		
		ivan.name = "Ivan Petrov";
		ivan.age = 23;
		ivan.weight = 85.5;
		ivan.personalID = 790202;
		ivan.isMale = true;
		//System.out.println("Ivan is " + ivan.age + " years old.");
		
		ivan.friend = maria;
		
		//System.out.println(ivan.friend.age);
		
		maria.name = "Maria Ilieva";
		//maria = ivan;
		//System.out.println("Maria is " + maria.age + " years old.");
		
	
		
		ivan.eat();
		maria.eat();
		
		System.out.println("Ivan age:" + ivan.age);
		
	
		ivan.drinkWater(5);
		ivan.drinkWater(10);
		
		System.out.println(ivan.name + " has drunk " + ivan.drunkLitersTillNow() + " liters till now");
		
		ivan.drinkWater(2);
		System.out.println(ivan.name + " has drunk " + ivan.drunkLitersTillNow() + " liters till now");
		
		maria.drinkWater(2);
		System.out.println(maria.name + " has drunk " + ivan.drunkLitersTillNow() + " liters till now");

	}
}
