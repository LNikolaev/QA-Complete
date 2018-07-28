package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheSumOfPrevious2Items03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = input.nextInt();

		List<Integer> arrList = new ArrayList<>();

		arrList.add(n);
		arrList.add(n);

		for (int i = 2; i < 10; i++) {
			arrList.add(arrList.get(i - 2) + arrList.get(i - 1));
		}
		for (int i : arrList) {
			System.out.print(i + " ");
		}
	}
}
