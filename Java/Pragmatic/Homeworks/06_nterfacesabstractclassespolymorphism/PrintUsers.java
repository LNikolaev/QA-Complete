package nterfacesabstractclassespolymorphism;

import java.text.SimpleDateFormat;
import java.util.Map;

public class PrintUsers {
	public static final SimpleDateFormat MY_DATE_FORMAT = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
	
	public static void printUsers(Map<String, User> users) {
		for (User user : users.values()) {
			System.out.printf("%s %s%n",user.getName(), MY_DATE_FORMAT.format(user.getRegisrationDate()));
		}
	}
}
