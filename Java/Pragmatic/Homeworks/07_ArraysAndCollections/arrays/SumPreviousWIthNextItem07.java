package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumPreviousWIthNextItem07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the massive: ");
		int[] array = new int[input.nextInt()];
		
		System.out.println("Enter Elements: ");

		for (int i = 0; i < array.length; i++) {
			System.out.printf("Element[%d]:", i);
			array[i] = input.nextInt();
		}
		
		int[] sumArray = new int[array.length];
		
		for (int i = 0; i < sumArray.length; i++) {
			if(i == 0){
				sumArray[0] = array[1];
			}
			if(i == sumArray.length - 1){
				sumArray[i] = array[i - 1]; 
			}
			if(i != 0 && i != sumArray.length - 1 ){
				sumArray[i] = array[i - 1] + array[i + 1];
			}
		}
		System.out.println(Arrays.toString(sumArray));
	}
}
