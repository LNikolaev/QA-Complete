package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayReverse09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of the masive: ");
		int length = input.nextInt();

		List<Integer> arrList = new ArrayList<>();
		List<Integer> reversedList = new ArrayList<>();

		System.out.println("Enter elements: ");
		for (int i = 0; i < length; i++) {
			arrList.add(input.nextInt());
		}

		for (int i = length - 1; i >= 0; i--) {
			reversedList.add(arrList.get(i));
		}

		System.out.println(reversedList.toString());
	}

}
