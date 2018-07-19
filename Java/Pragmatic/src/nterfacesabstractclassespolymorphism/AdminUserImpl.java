package nterfacesabstractclassespolymorphism;

import java.util.Date;
import java.util.Map;

public class AdminUserImpl extends AbstractUser implements AdminUser {

	public AdminUserImpl(String name, String password, Date registrationDate) {
		super(name, password, registrationDate);
		
	}

	@Override
	public boolean addUser(User user, Map<String, User> users) {
		if (users.containsKey(user.getName()) || !isLoggedIn()) {
			return false;
		}
		users.put(user.getName(), user);
		System.out.printf("User %s is succeffully added.%n", user.getName());
		return true;
	}

	@Override
	public boolean removeUser(User user, Map<String, User> users) {
		if (users.containsKey(user.getName()) || !isLoggedIn()) {
			return false;
		}
		users.remove(user.getName());
		System.out.printf("User %s is succeffully removed.%n", user.getName());
		return true;
	}
	
	
}
