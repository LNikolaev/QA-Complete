package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse09 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the masive: ");
		int length = input.nextInt();		
		int[] array = new int[length];
		System.out.println("Enter elements: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		for (int i = 0; i < array.length / 2; i++) {
			int temp = 0;
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
