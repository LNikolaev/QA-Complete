import java.util.Scanner;

public class SwapThreeNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a1 = input.nextInt();
		System.out.print("Enter b:");
		int a2 = input.nextInt();
		System.out.print("Enter c:");
		int a3 = input.nextInt();
		System.out.printf("OLD %d %d %d", a1, a2, a3);
		System.out.println();
		int temp;
		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		System.out.printf("NEW %d %d %d", a1, a2, a3);

	}
}

/*
 * �������� 3 ����� �� ������������ �1, �2 � �3. ��������� ����������� �� ����,
 * �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, � �3 �� ���
 * ������� �������� �� �1.
 */