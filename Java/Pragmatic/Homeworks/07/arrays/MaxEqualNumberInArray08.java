package arrays;

import java.util.Scanner;

public class MaxEqualNumberInArray08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the massive: ");
		int[] arr = new int[input.nextInt()];

		System.out.println("Enter Elements: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Element[%d]:", i);
			arr[i] = input.nextInt();
		}

		int count = 0;
		int max = 0;
		int number = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				count++;
				if (count > max) {
					max = count;
					number = arr[i];
				}

			} else {
				count = 0;
			}
		}
		for (int i = 0; i <= max; i++) {
			System.out.println(number);
		}

	}
}
