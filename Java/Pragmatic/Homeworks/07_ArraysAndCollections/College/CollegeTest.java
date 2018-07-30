package College;

public class CollegeTest {

	public static void main(String[] args) {
		College college = new College();
		college.addStudent("Ivan", 5.59);
		college.addStudent("Dimo", 4.59);
		college.addStudent("Simona", 6.00);
		college.addStudent("Nadq", 4.59);
		college.addStudent("Ekaterina", 5.59);
		college.addStudent("Ivan", 5.59);
		
		
		college.addStudentInGroup("Lubo", 6.00);
		college.addStudentInGroup("Katq", 4.00);
		college.addStudentInGroup("Cveti", 3.00);
		college.addStudentInGroup("Dani", 2.00);
		college.addStudentInGroup("Ely", 5.00);
		college.printGroupStudents();
		college.sortGroupStudents();
		System.out.println();
		college.printGroupStudents();
	}
}
