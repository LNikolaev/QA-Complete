import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();

		firstWay(number);
		secondWay(number);
	}

	static void firstWay(int number) {
		int counter = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				counter++;
			}
			if (number == 1) {
				counter = 2;
				break;
			}
		}
		if (counter == 2) {
			System.out.println(number + " Is prime ");
		} else {
			System.out.println(number + " Is not prime");
		}
	}

	static void secondWay(int number) {
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println("---------------------");
		System.out.println("SECOND WAY:");
		if (isPrime) {
			System.out.println(number + " Is prime");
		} else {
			System.out.println(number + " Is not prime");
		}
	}
}

/*
 * Въведете число от клавиатурата и определете дали е просто. Просто число е
 * това което се дели САМО на 1 и на себе си.
 */