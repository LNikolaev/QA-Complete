package positive;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.admin.AdminLogin;
import utilities.Browser;
import utilities.verifcators.CommonVerifications;

public class AdminLoginTest {
	
	@Before
	public void setup() {
		Browser.open("chrome");
	}
	
	@Test
	public void successfulLogin() {
		AdminLogin.open();
		AdminLogin.login("admin", "parola123!");
		
		CommonVerifications.verifyTitle("Dashboard",
				"The title was not present, so we are NOT logged in. BUUUG! ");
	}
	
	
	@After
	public void tearDown() {
		Browser.quit();
	}
}
