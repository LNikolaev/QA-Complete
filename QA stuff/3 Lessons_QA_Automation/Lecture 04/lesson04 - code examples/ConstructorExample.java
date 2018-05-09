package lesson06;

public class ConstructorExample {
	public static void main(String[] args) {
		Person petko = new Person();
		petko.name = "Petko";
		petko.age = 21;
		
		Person maria = new Person(22, "Maria");
		System.out.println(maria.age);
	}
}
