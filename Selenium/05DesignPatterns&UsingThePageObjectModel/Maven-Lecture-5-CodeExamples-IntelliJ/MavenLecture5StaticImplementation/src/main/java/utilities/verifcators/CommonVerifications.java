package utilities.verifcators;

import org.junit.Assert;

import utilities.Browser;

public class CommonVerifications {

	/**
	 * Verifies the expected title you pass as param and if it fails
	 * it populates the message in your reports
	 * 
	 * @param expectedTitle the title you would expect to be present in the browser
	 * @param messageOnFailure the message that will appear in your reports in case of failure
	 */
	public static void verifyTitle(String expectedTitle, String messageOnFailure) {
		String actualTitle = Browser.driver.getTitle();
		
		Assert.assertEquals(messageOnFailure, expectedTitle, actualTitle);
	}

}
