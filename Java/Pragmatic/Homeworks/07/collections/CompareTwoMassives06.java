package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTwoMassives06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isEquals = true;

		System.out.println("Enter length of the first massive: ");
		int firstLength = input.nextInt();
		List<Integer> firstList = new ArrayList<>();

		for (int i = 0; i < firstLength; i++) {
			System.out.printf("Element[%d] = ", i);
			firstList.add(input.nextInt());
		}

		System.out.println("Enter length of the first massive: ");
		int secondLength = input.nextInt();
		List<Integer> secondList = new ArrayList<>();

		for (int i = 0; i < secondLength; i++) {
			System.out.printf("Element[%d] = ", i);
			secondList.add(input.nextInt());
		}

		if (firstList.size() != secondList.size()) {
			isEquals = false;
			throw new ArrayIndexOutOfBoundsException("Different length!");
		} else {
			System.out.println("Massives have equal lengths.");
		}
		for (int i = 0; i < firstList.size(); i++) {
			if (firstList.get(i) != secondList.get(i)) {
				isEquals = false;
			}
		}
		System.out.println("Is equals? : " + isEquals + "\n" + firstList.toString() + "\n" + secondList.toString());
	}

}
