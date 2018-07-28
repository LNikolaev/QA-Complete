package nterfacesabstractclassespolymorphism;

import java.util.Date;

public interface User {
	public boolean login(String password);

	public boolean logout();

	public String getName();

	public Date getRegisrationDate();
}
