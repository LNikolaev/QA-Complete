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

/*Да се прочетат 2 числа от клавиатурата А и В. 
Да се изведат всички числа от А до В на степен 2(разделени с запетая).
Ако някое число е кратно на 3, да се изведе съобщение че числото се пропуска „skip 3“.
Ако сумата от всички изведени числа (без пропуснатите) стане по-голяма от 200, да се прекрати извеждането.*/