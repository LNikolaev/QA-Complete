import java.util.Scanner;

public class NumbersDividedByThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ",");
			}
		}

	}

}

/*
 * ���������� �� 3, �� �� ������� �� ������ ������� n ����� ����� �� ����� �� 3.
 * ������� �� �� ��������� ��� �������.
 */