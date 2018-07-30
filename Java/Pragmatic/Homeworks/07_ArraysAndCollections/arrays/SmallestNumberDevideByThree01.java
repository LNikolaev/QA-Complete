package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumberDevideByThree01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the masive: ");
		int length = input.nextInt();		
		int[] arr = new int[length];
		System.out.println("Enter elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.println("The smallest number devide by 3 is: " + arr[i]);
				break;
			}
		}
	}
}
