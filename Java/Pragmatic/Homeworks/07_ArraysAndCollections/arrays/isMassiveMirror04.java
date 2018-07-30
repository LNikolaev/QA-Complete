package arrays;

import java.util.Scanner;

public class isMassiveMirror04 {
	public static void main(String[] args) {

		System.out.println("Is massive mirror? " + isMirror());

	}

	private static boolean isMirror() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the massive: ");
		int[] array = new int[input.nextInt()];
		boolean isMirror = true;
		System.out.println("Enter Elements: ");

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Element[%d]:", i);
			array[i] = input.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] != array[array.length - i - 1]) {
				isMirror = false;
			}
		}
		return isMirror;
	}
}
