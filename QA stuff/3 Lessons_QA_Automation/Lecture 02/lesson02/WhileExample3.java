package lesson02;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
				
		while(n >= 1) {
			if(n % 7 == 0) {
				System.out.print(n + " ");
			}
			n--;
		}
	}
}
