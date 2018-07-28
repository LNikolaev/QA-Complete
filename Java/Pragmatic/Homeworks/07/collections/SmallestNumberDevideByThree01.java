package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmallestNumberDevideByThree01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the masive: ");
		int length = input.nextInt();
		
		List<Integer> arrList = new ArrayList<>();
	
		System.out.println("Enter elements: ");
		for (int i = 0; i < length; i++) {
			arrList.add(input.nextInt());
		}
		Collections.sort(arrList);
		for (Integer integer : arrList) {
			System.out.print(integer + " ");
		} 

		System.out.println();
		for (int i = 0; i < arrList.size(); i++) {
			if (arrList.get(i) % 3 == 0) {
				System.out.println("The smallest number devide by 3 is: " + arrList.get(i));
				break;
			}
		}
	}
}
