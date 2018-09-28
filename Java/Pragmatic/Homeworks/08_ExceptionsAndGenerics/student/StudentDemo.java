package student;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setFirstName("Cvetii");
		s1.setLastName("Cveteva");
		s1.setAge(18);
		s1.setGender(Gender.FEMALE);
		System.out.println(s1);
		
		Registry<Address> addresses = new Registry<>();	
		addresses.addElementToRegistry(new Address("Shumen", "Ivan Vazov", 33));
		addresses.addElementToRegistry(new Address("Varna", "Ivan Vazov", 33));
		addresses.addElementToRegistry(new Address("Sofiq", "Ivan Vazov", 33));
		addresses.removeElementFromRegistry(0);
		Registry<SchoolStudent> students = new Registry<>();
		students.addElementToRegistry(new SchoolStudent("Dimityr", "Dimitrov", "5A", 11));
		
		addresses.registryInfo();
		students.registryInfo();

	}

}
