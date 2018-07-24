import java.util.Scanner;

public class PrintCube {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int n = number - 1;

		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.print(n);
			}
			n+=2;
			System.out.println();
		}

	}

}
/*
 * По зададено число n, да се изведе на екрана таблица по следния начин:
 */