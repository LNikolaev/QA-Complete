import java.util.Scanner;

public class MiddleNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		double a = input.nextDouble();
		System.out.print("Enter b:");
		double b = input.nextDouble();
		System.out.print("Enter c:");
		double c = input.nextDouble();
		
		if ((c > a && c < b) || (c < a && c > b)) {
			System.out.printf("C:%.1f is between A:%.1f and B:%.1f", c,a,b);
		} else {
			System.out.println("C is not between A and B");
		}

	}
}

/*
 * �� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
 * ������������ A � B (���� �� �� � ������� ������� � double). ����� �� ��
 * ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B. �� �� ������
 * ��������� ��������� �� ���� ���� C � ����� A � B.
 */