import java.util.Scanner;

public class NumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int a = input.nextInt();
		System.out.print("Enter number: ");
		int b = input.nextInt();
		int temp = 0;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}

}
/*
 * �� �� ������� �� ����������� 2 �����. � �� �� ������� �� ������ ������ �����
 * �� ��-������� �� ��-��������.
 */