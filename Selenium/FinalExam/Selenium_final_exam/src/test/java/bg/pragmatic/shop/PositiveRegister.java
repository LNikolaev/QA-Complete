package bg.pragmatic.shop;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PositiveRegister {
	WebDriver driver;
	public static final String EMAIL_FROM_GENERATOR = generateRandomStringForRegister().concat("@abv.bg");
	
	@BeforeTest
	void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\QA\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://shop.pragmatic.bg");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void register() {

		driver.findElement(By.xpath("//a[@title='My Account']/span[contains(text(), 'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Luben");
		driver.findElement(By.id("input-lastname")).sendKeys("Lubenov");
		
		driver.findElement(By.id("input-email")).sendKeys(EMAIL_FROM_GENERATOR);
		
		driver.findElement(By.id("input-telephone")).sendKeys("0895555555");
		driver.findElement(By.id("input-password")).sendKeys("asd123");
		driver.findElement(By.id("input-confirm")).sendKeys("asd123");

		WebElement radio = driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		verifyRadioButton(radio);
		verifyCheckBox(checkbox);

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		String actual = driver.getTitle();
		String expected = "Your Account Has Been Created!";

		Assert.assertEquals(actual, expected, "Sucsessfully Register!");

		login();

	}

	@Test(dependsOnMethods="register")
	private void login() {
		driver.findElement(By.xpath("//a[@title='My Account']/span[contains(text(), 'My Account')]")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("//a[@title='My Account']/span[contains(text(), 'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(EMAIL_FROM_GENERATOR);
		driver.findElement(By.id("input-password")).sendKeys("asd123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String actual = driver.getTitle();
		String expected = "My Account";

		Assert.assertEquals(actual, expected, "Sucsessfully Login!");
		
	}

	public static String generateRandomStringForRegister() {

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();

		return generatedString;
	}

	/*
	 * @AfterTest void tearDown() { driver.quit(); }
	 */

	private void verifyRadioButton(WebElement radio) {
		if (radio.isEnabled()) {
			if (radio.isDisplayed()) {
				if (!radio.isSelected()) {
					radio.click();
				}
			}
		}
	}

	private void verifyCheckBox(WebElement checkbox) {
		if (checkbox.isEnabled()) {
			if (checkbox.isDisplayed()) {
				if (!checkbox.isSelected()) {
					checkbox.click();
				}
			}
		}
	}
}
