package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxEqualNumberInArray08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();

		System.out.print("Enter length of the list: ");
		int length = input.nextInt();
		int count = 0;
		int max = 0;
		int number = 0;

		System.out.println("Enter Elements: ");
		for (int i = 0; i < length; i++) {
			System.out.printf("Element[%d]:", i);
			list.add(input.nextInt());
		}

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) == list.get(i + 1)) {
				count++;
				if (count > max) {
					max = count;
					number = list.get(i);
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
