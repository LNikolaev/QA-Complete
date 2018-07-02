import java.util.Scanner;

public class Zad2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = input.nextInt();
		System.out.print("Enter b:");
		int b = input.nextInt();
		System.out.println("A: " + a + "| B: " + b);
		System.out.printf("Sum: %d\n", a + b);
		System.out.printf("Difference: %d\n", a - b);
		System.out.printf("multiplication: %d\n", a * b);
		System.out.printf("remainder of division: %d\n", a % b);
		System.out.printf("division: %d", a % b);

	}

}

/*
 * Въведете 2 различни целочислени числа от конзолата. Запишете тяхната сума,
 * разлика, произведение, остатък от деление и целочислено деление в отделни
 * променливи и разпечатайте тези резултати в конзолата. Опитайте същото с числа
 * с плаваща запетая.
 */