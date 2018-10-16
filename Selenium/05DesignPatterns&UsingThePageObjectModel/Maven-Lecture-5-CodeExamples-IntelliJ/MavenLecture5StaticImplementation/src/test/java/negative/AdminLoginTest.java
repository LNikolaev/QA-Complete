package negative;

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
	public void unsuccessfulLogin() {
		AdminLogin.open();
		AdminLogin.login("fdasfdas", "dsfasfd");
		
		AdminLogin.verifyLoginFormValidationMessage("No match for Username and/or Password.",
				"The expected validation message for wrong credentials was not present, BUUUUUG");
	}
	
	
	@After
	public void tearDown() {
		Browser.quit();
	}
}
