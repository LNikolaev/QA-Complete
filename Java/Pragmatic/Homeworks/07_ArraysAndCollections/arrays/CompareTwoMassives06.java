package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoMassives06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isEquals = true;

		System.out.println("Enter length of the first massive: ");
		int firstLength = input.nextInt();
		int[] arr1 = new int[firstLength];

		System.out.println("Enter Elements: ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.printf("Element[%d] = ", i);
			arr1[i] = input.nextInt();
		}

		System.out.println("Enter length of the second massive: ");
		int secondLength = input.nextInt();
		int[] arr2 = new int[secondLength];

		System.out.println("Enter Elements: ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.printf("Element[%d] = ", i);
			arr2[i] = input.nextInt();
		}

		if (arr1.length != arr2.length) {
			isEquals = false;
			throw new ArrayIndexOutOfBoundsException("Different length!");
		} else {
			System.out.println("Massives have equal lengths.");
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				isEquals = false;
			}
		}
		System.out.println("Is equals? : " + isEquals + "\n" + Arrays.toString(arr1) + "\n" + Arrays.toString(arr2));
	}

}
