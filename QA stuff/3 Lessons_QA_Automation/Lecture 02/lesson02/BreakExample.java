package lesson02;

public class BreakExample {
	public static void main(String[] args) {
		for (int i = 0; i < 200000000; i++) {
			System.out.println(i);
			if(i == 10000) {
				break;
			}
		}
	}
}
