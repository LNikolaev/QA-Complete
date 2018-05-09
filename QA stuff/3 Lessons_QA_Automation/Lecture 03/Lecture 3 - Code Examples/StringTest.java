package lesson03;

public class StringTest {

	public static void main(String[] args) {
		
		String message = "Hello";
		
		System.out.println(message);
		
		String firstName = "Stanislav";
		String lastName = "Georgiev";
		
		String name = firstName + " " + lastName;
		//System.out.println(name.toUpperCase());
		System.out.println(name.length());
		
		System.out.println(name == "Stanislav Georgiev");
		System.out.println(name.equals("Stanislav Georgiev"));
		
		
		System.out.println("Today lecture is \"OOP\"");
	}

}
