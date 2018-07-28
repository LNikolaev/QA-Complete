package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class halfMirrorElements02 {

	public static void main(String[] args) {

		combineInt();
	}

	private static void combineInt() {
		Scanner input = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> fullList = new ArrayList<Integer>();

		System.out.print("Enter lenght of the list: ");
		int length = input.nextInt();

		for (int i = 0; i < length; i++) {
			list.add(input.nextInt());
		}

		for (int i = 0; i < 2; i++) {
			fullList.addAll(list);
		}
		System.out.println(fullList.toString());
	}
}
