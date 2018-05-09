package lesson02;

import java.util.Scanner;

public class ForExample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i = 0; i < number; i++) {
			System.out.print(number + " ");
		}
	}

}
