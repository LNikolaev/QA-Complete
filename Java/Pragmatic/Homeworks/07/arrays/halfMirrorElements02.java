package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class halfMirrorElements02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter lenght of the massive: ");
		int length = input.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("Enter element[%d]: ", i);
			arr[i] = input.nextInt();
		}

		int[] result = combineInt(arr);

		System.out.println(Arrays.toString(result));

		System.out.println("Second way: ");

		secondWay(arr);

	}

	private static void secondWay(int[] array) {

		int[] full = new int[array.length * 2];
		for (int i = 0; i < full.length; i++) {
			if (i <= array.length - 1) {
				full[i] = array[i];
				full[full.length / 2 + i] = array[i];
			}
		}
		System.out.println(Arrays.toString(full));
	}

	public static int[] combineInt(int[] arr) {
		int length = arr.length * 2;
		int[] result = new int[length];
		System.arraycopy(arr, 0, result, 0, arr.length);
		System.arraycopy(arr, 0, result, arr.length, arr.length);
		return result;
	}
}
