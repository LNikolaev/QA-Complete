package homework.exceptions;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setFirstName("Cvetii");
		s1.setLastName("Cveteva");
		s1.setAge(18);
		s1.setGender(Gender.FEMALE);
		System.out.println(s1);
		Registry<Integer> adressNumbers = new Registry<>();
		
		

	}

}
