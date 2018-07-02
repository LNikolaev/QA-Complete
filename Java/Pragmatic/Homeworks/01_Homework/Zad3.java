import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = input.nextInt();
		System.out.print("Enter b:");
		int b = input.nextInt();
		System.out.printf("Old --> A: %d | B:%d", a, b);
		System.out.println();
		int temp = 0;
		
		 temp = a;
		 a = b;
		 b = temp;
		 System.out.printf("NEW --> A: %d | B:%d", a, b);
	}

}

/*Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте новите стойности*/