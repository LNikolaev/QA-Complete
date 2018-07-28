package inheritance;

public class Student extends Person {
	private double score;

	public Student(String name, int age, boolean isMan, double score) {
		super(name, age, isMan);
		validateStudentParams(score);
		this.score = score;
	}

	private void validateStudentParams(double score) {
		if (score > 6 || score < 2) {
			throw new IndexOutOfBoundsException("ERROR:\nThe score must be in range from 2 to 6 !!!");
		}
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score > 2 || score < 6) {
			this.score = score;
		} else {
			throw new IndexOutOfBoundsException("ERROR:\nThe score must be in range from 2 to 6 !!!");
		}
	}

	void showStudentInfo() {
		System.out.printf("Student information:%nName: %s%nAge: %d%nIs man:%b%nScore: %.2f%n", this.getName(),
				this.getAge(), this.isMan(), this.getScore());
	}
}
