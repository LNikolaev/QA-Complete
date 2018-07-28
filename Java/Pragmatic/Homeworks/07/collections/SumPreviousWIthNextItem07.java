package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumPreviousWIthNextItem07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the masive: ");
		int length = input.nextInt();

		List<Integer> arrList = new ArrayList<>();

		System.out.println("Enter elements: ");
		for (int i = 0; i < length; i++) {
			arrList.add(input.nextInt());
		}
		System.out.println(arrList.toString());
		List<Integer> sumArray = new ArrayList<>();

		for (int i = 0; i < length; i++) {
			if (i == 0) {
				sumArray.add(arrList.get(1));
			}
			if (i == length - 1) {
				sumArray.add(i, arrList.get(i - 1));
			}
			if (i != 0 && i != sumArray.size() - 1) {
				sumArray.add(i, arrList.get(i - 1) + arrList.get(i + 1));
			}
		}
		System.out.println(sumArray.toString());
	}
}