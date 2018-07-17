package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InheritanceImpl {
	public static void main(String[] args) {
		Person pIvan = new Person("Ivan", 17, false);
		Person pNikolay = new Person("Nikolay", 22, true);
		Student sGosho = new Student("Gosho", 21, true, 2);
		Student sNadq = new Student("Nadq", 32, false, 5);
		Employee eEmo = new Employee("Emo", 22, true, 80);
		Employee eIna = new Employee("Ina", 31, false, 170);

		List<Person> persons = new ArrayList<>(10);
		persons.addAll(Arrays.asList(pIvan, pNikolay, sGosho, sNadq, eEmo, eIna));

		Consumer<Person> lambdaConsumer = person -> {
			if (person instanceof Employee) {
				((Employee) person).showEmployeeInfo();
				System.out.println("2 hours overtime: " + ((Employee) person).calculateOvertime(2));
			} else if (person instanceof Student) {
				((Student) person).showStudentInfo();
			} else {
				person.showPersonInfo();
			}
		};
		persons.forEach(lambdaConsumer);

	}
}
