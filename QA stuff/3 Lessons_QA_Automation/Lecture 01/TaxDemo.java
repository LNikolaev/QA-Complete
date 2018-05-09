package lesson01;

import java.util.Scanner;

public class TaxDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter salary:");
		double salary = scanner.nextDouble();
		
		double tax = 0;
		if(salary > 2000) {
			tax = salary * 0.1;
			salary = salary - tax;
		}
		System.out.println("The tax is " + tax);
		System.out.println("The salary is " + salary);
	}

}
