package lesson02;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			//sum = sum + i;
			sum += i;
		}
		
		System.out.println("The sum is " + sum);
	}

}
