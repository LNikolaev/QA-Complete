package student.exceptions;

@SuppressWarnings("serial")
public class InvalidStudentFirstNameException extends IllegalArgumentException{
	public InvalidStudentFirstNameException(){
		System.out.println("The length of the first name must be greater than 12 symbols.");
	}

}
