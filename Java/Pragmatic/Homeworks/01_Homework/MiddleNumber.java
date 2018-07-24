import java.util.Scanner;

public class MiddleNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		double a = input.nextDouble();
		System.out.print("Enter b:");
		double b = input.nextDouble();
		System.out.print("Enter c:");
		double c = input.nextDouble();
		
		if ((c > a && c < b) || (c < a && c > b)) {
			System.out.printf("C:%.1f is between A:%.1f and B:%.1f", c,a,b);
		} else {
			System.out.println("C is not between A and B");
		}

	}
}

/*
 * Да се изведат съобщения към потребителя и да се прочетат 2 числа от
 * клавиатурата A и B (може да са с плаваща запетая – double). После да се
 * прочете 3-то число C и да се провери дали то е м/у A и B. Да се изведе
 * подходящо съобщение за това дали C е между A и B.
 */