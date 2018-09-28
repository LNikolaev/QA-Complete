package student.exceptions;

@SuppressWarnings("serial")
public class InvalidStudentLastNameException extends IllegalArgumentException{
	public InvalidStudentLastNameException(){
		System.out.println("The length of the last name must be less than 20 symbols.");
	}

}
