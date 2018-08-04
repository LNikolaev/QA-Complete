package student;

public class SchoolStudent {
	private String firstName;
	private String lastName;
	private String grade;
	private int age;

	public SchoolStudent(String firstName, String lastName, String grade, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGrade() {
		return grade;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "SchoolStudent [firstName=" + firstName + ", lastName=" + lastName + ", grade=" + grade + ", age=" + age
				+ "]";
	}

	
}
