package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ElementMultiplyByIndex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter lenght of the massive: ");
		int length = input.nextInt();		
		List<Double> list= new ArrayList<>();

		for (int i = 0; i < length; i++) {
			System.out.printf("Enter element[%d]: ", i);
			list.add(input.nextDouble());
		}

		for (int i = 0; i < list.size(); i++) {			
			list.set(i, (double) (i * 3));
			
		}
		System.out.println(list.toString());
	}

}
