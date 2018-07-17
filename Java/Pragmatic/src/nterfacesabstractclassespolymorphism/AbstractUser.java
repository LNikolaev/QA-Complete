package nterfacesabstractclassespolymorphism;

import java.util.Date;

public class AbstractUser implements User {
	private String name;
	private String password;
	private Date registrationDate;
	private boolean isLoggedIn;

	public AbstractUser(String name, String password, Date registrationDate) {
		super();
		this.name = name;
		this.password = password;
		this.registrationDate = registrationDate;
	}

	public boolean isLoggedIn() {
		return isLoggedIn;
	}


	@Override
	public boolean login(String password) {
		if (password == null || !this.password.equals(password) || isLoggedIn) {
			return false;
		}
		isLoggedIn = true;
		return true;
	}

	@Override
	public boolean logout() {
		isLoggedIn = false;
		return false;
	}

	@Override
	public Date getRegisrationDate() {		
		return this.registrationDate;
	}

	@Override
	public String getName() {
		
		return this.name;
	}

}
