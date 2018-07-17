package inheritance;

public class Employee extends Person {
	private double daySalary;
	private double overTimeSalary;

	public Employee(String name, int age, boolean isMan, double daySalary) {
		super(name, age, isMan);
		this.daySalary = daySalary;
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		this.daySalary = daySalary;
	}

	double calculateOvertime(double overTimeHours) {
		if (this.getAge() < 18) {
			overTimeSalary = 0;
		} else {
			double hourlyRate = getDaySalary() / 8;
			overTimeSalary = hourlyRate * overTimeHours * 1.5;
		}
		return overTimeSalary;
	}

	void showEmployeeInfo() {
		System.out.printf("Employee information:%nName: %s%nAge: %d%nIs man:%b%nDay salary: %.2f%n", this.getName(),
				this.getAge(), this.isMan(), this.getDaySalary());
	}
}
