package lesson02;

public class ContinueExample {
	public static void main(String[] args) {
		int i = 0;
		while (i <= 50) {
			i = i + 1;
			if(i % 7 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
