package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementMultiplyByIndex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter lenght of the massive: ");
		int length = input.nextInt();
		double[] arr = new double[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter element[%d]: ", i);
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}
		System.out.println(Arrays.toString(arr));
	}

}
