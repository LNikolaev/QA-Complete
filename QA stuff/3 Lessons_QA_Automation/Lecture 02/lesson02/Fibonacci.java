package lesson02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();

        int prev = 0;
        int next = 1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(next + " + ");

            sum = sum + next;
            int prevTemp = prev;
            prev = next;
            next = prevTemp + next;
        }

        System.out.println(" the sum is " + sum);
    }
}

