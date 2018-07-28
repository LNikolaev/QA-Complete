package inheritance;

public class Person {
	private String name;
	private int age;
	private boolean isMan;

	public Person(String name, int age, boolean isMan) {
		super();
		this.name = name;
		this.age = age;
		this.isMan = isMan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMan() {
		return isMan;
	}

	public void setMan(boolean isMan) {
		this.isMan = isMan;
	}
	
	void showPersonInfo() {
		System.out.printf("Person information:%nName: %s%nAge: %d%nIs man:%b%n", this.getName(),
				this.getAge(), this.isMan());
	}
}
