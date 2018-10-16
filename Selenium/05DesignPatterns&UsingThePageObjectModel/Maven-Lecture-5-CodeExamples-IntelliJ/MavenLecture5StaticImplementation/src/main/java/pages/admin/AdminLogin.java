package pages.admin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.Browser;

public class AdminLogin {
	
	private static final By LOC_USERNAME_FIELD = By.id("input-username");
	private static final By LOC_PASSWORD_FIELD = By.id("input-password");
	private static final By LOC_LOGIN_BUTTON = By.cssSelector("div.panel-body button.btn.btn-primary"); 
	
	private static final By LOC_LOGIN_FORM_VALIDATION_MESSAGE = By.cssSelector("div.alert-danger");
	/**
	 * This method opens the administration login page
	 */
	public static void open() {
		Browser.driver.get("http://shop.pragmatic.bg/admin");
	}

	/**
	 * Logs into the administration user  area with the provided credentials.
	 * Enters the user and the pass and then it clicks on the login button
	 * 
	 * @param username the username you would like to login with
	 * @param password the password you would like to login with
	 */
	public static void login(String username, String password) {
		WebElement usernameField = Browser.driver.findElement(LOC_USERNAME_FIELD);
		usernameField.sendKeys(username);
		Browser.driver.findElement(LOC_PASSWORD_FIELD).sendKeys(password);
		Browser.driver.findElement(LOC_LOGIN_BUTTON).click();;
	}

	/**
	 * Verifies the validation message present in the login page after
	 * unsuccessful attempt to login
	 * 
	 * @param expectedValidationMessage the validation message you would expect to be present
	 * @param messageOnFailure the message that will appear in the report in case of failures
	 */
	public static void verifyLoginFormValidationMessage(String expectedValidationMessage, String messageOnFailure) {
		String actualValidationMessage = Browser.driver.findElement(LOC_LOGIN_FORM_VALIDATION_MESSAGE).getText();
	
		Assert.assertTrue(messageOnFailure, actualValidationMessage.contains(expectedValidationMessage));
	}

}
