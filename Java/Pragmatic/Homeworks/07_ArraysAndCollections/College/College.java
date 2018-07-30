package College;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class College {
	private Set<Student> studentList;
	private List<Student> groupStudents;

	public College() {
		studentList = new HashSet<>();
		groupStudents = new ArrayList<>();
	}

	public void addStudent(String name, double grade) {
		studentList.add(new Student(name, grade));
	}

	public void addStudentInGroup(String name, double grade) {
		groupStudents.add(new Student(name, grade));
	}

	public void sortGroupStudents() {
		Collections.sort(groupStudents, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.getGrade() < o2.getGrade()) {
					return 1;
				} else if (o2.getGrade() > o2.getGrade()) {
					return 0;
				} else
					return -1;
			}
		});
	}

	public void printStudentsInfo() {
		for (Student student : studentList) {
			System.out.println(student);
		}
	}

	public void printGroupStudents() {
		for (Student student : groupStudents) {
			System.out.println(student);
		}
	}
}
