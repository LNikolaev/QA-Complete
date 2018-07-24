import java.util.Scanner;

public class NumbersFromAtoB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.print("Enter b: ");
		int b = input.nextInt();
		double sum = 0;
		int temp;
		
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		for (int i = a; i <= b; i++) {		
			
			if (i % 3 == 0) {
				System.out.printf("skip %d, ", i);
				continue;
			}
			System.out.printf("%.0f, ",Math.pow(i, 2));
			sum += Math.pow(i, 2);
			if (sum > 200) {
				break;
			}
		}		
	}
}

/*�� �� �������� 2 ����� �� ������������ � � �. 
�� �� ������� ������ ����� �� � �� � �� ������ 2(��������� � �������).
��� ����� ����� � ������ �� 3, �� �� ������ ��������� �� ������� �� �������� �skip 3�.
��� ������ �� ������ �������� ����� (��� ������������) ����� ��-������ �� 200, �� �� �������� �����������.*/