package homework.exceptions;

@SuppressWarnings("serial")
public class InvalidStudentAgeException extends IllegalArgumentException{
	public InvalidStudentAgeException(){
		System.out.println("Age must bie in range between 7 and 18.");
	}

}
