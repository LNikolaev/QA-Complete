import java.util.Scanner;

public class Zad7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Are u helth (Y/N): ");
		String health = input.next();
		System.out.print("Enter hour e.g \"HH\": ");
		int hour = input.nextInt();
		System.out.print("Enter money: ");
		float money = Math.abs(input.nextFloat());

		boolean Helth = true;
		
		if (!health.equals("Y") && !health.equals("N")) {
			System.err.println("Incorrect health status! Please enter correct answer. \nFollow the pattern (Y/N) !");
			
		} else {
			if (health.equals("Y")) {

				if (hour > 0 && hour < 24) {
					if (money > 0 && money < 10) {
						System.out.println("I will go to coffe");
					} else {
						System.out.printf("I have %.1f money and i can do anything ^_^ ", money);
					}
				} else {
					System.err.println("Please enter valid hour !");
				}
			} else if (health.equals("N")) {
				Helth = false;
				if (hour > 0 && hour < 24) {
					System.out.println("I am not allright and i will not go out!");
					System.out.println("I will drink tea in home.");
					if (money > 0) {
						System.out.printf("And after that i will buy medicine. Money:%.1f", money);
					}
				} else {
					System.err.println("Please enter valid hour ! ");
				}
			}
		}
	}
}

/*
 * Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари
 * (число с плаваща запетая), дали съм здрав – булев тип. Съставете програма,
 * която взема решения на базата на тези данни по следния начин: - ако съм болен
 * няма да излизам - ако имам пари ще си купя лекарства - ако нямам – ще стоя
 * вкъщи и ще пия чай - ако съм здрав - ако имам по-малко от 10 лв ще отида на
 * кафе и т.н Полученото решение покажете като съобщение в конзолата.
 */