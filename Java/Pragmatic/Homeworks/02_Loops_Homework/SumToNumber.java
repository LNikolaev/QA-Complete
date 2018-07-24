import java.util.Scanner;

public class SumToNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}

/*Да се прочете число от екрана(конзолата) 
и да се изведе сбора на всички числа между 1 и въведеното число.*/