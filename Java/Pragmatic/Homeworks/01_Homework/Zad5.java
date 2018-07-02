import java.util.Scanner;

public class Zad5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = input.nextInt();
		System.out.print("Enter b:");
		int b = input.nextInt();
		System.out.print("Enter c:");
		int c = input.nextInt();

		if (a > b && a > c && b > c) { //
			System.out.println(a + " " + b + " " + c);
		} else if (a > b && a > c && b < c) {
			System.out.println(a + " " + c + " " + b);
		} else if (c > a && c > b && b > a) {
			System.out.println(c + " " + b + " " + a);
		}
		if (b > a && b > c && c > a) {
			System.out.println(b + " " + c + " " + a);
		} else if (b > a && b > c && c < a) {
			System.out.println(b + " " + a + " " + c);
		} else {
			System.out.println(c + " " + a + " " + b);
		}
	}

}

/* Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред. */