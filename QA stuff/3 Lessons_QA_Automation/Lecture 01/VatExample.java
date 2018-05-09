package lesson01;

import java.util.Scanner;

public class VatExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter prise:");
		double prise = sc.nextDouble();
		double vat = prise * 0.2;
		
		System.out.println("The VAT of " + prise + "$ is " + vat + "$");
	}
}
