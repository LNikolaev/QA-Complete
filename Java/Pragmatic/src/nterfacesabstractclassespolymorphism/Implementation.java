package nterfacesabstractclassespolymorphism;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Implementation {
	public static void main(String[] args) {
		Map<String, User> users = new LinkedHashMap<>();
		users.put("root", new AdminUserImpl("root", "root", new Date()));

		AdminUser admin = (AdminUser) users.get("root");
		admin.login("root");

		for (int i = 1; i <= 10; i++) {
			User user = new UserImpl("User" + i, "password" + i, new Date());
			admin.addUser(user, users);
		}
		
		PrintUsers.printUsers(users);
		

		User user = (User) users.get("User1");
		user.login("password1");
		System.out.println(user);



		admin.removeUser(users.get("User3"), users);
		PrintUsers.printUsers(users);

		user.logout();
		System.out.println(user);
	}
}
