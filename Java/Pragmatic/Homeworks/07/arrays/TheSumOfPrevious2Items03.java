package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheSumOfPrevious2Items03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();

		int[] arr = new int[10];
		arr[0] = n;
		arr[1] = n;
		
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];			
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}	
	}
}
