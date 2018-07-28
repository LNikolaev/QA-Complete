package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class isMassiveMirror04 {
	public static void main(String[] args) {
		
		System.out.println("Is list mirror? " + isMirror());
		
		
	}

	private static boolean isMirror() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of the list: ");
		int length = input.nextInt();
		List<Integer> list = new ArrayList<>();
		boolean isMirror = true;
		System.out.println("Enter Elements: ");		
		for (int i = 0; i < length; i++) {
			System.out.printf("Element[%d]:", i);
			list.add(input.nextInt());
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != list.get(list.size() - 1 - i)) {				
				isMirror = false;
			}
		}
		return isMirror;

	}
}
