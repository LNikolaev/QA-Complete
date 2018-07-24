import java.util.Scanner;

public class IncreaseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = input.nextInt();
		System.out.print("Enter b:");
		int b = input.nextInt();
		System.out.println(Math.min(a, b) + " " + Math.max(a, b));
	}

}
