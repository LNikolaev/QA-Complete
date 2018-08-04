package student;

import student.exceptions.InvalidStudentAgeException;
import student.exceptions.InvalidStudentFirstNameException;
import student.exceptions.InvalidStudentLastNameException;

public class Student {
	private String firstName;
	private String lastName;
	private int age;
	private Gender gender;
	
	public Student(String firstName, String lastName, int age, Gender gender) {		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	
	public Student(){
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		validateFirstName(firstName);
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 7 || age > 18) {
			throw new InvalidStudentAgeException();
		}
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		validateLastName(lastName);
		this.lastName = lastName;
	}
	
	void validateFirstName(String firstName){
		if (firstName.length() > 12) {
			throw new InvalidStudentFirstNameException();
		}
	}
	
	void validateLastName(String lastName){
		if (lastName.length() > 20) {
			throw new InvalidStudentLastNameException();
		}
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
}
