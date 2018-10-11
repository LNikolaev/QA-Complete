package bg.pragmatic.shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * @author Lubo
 * This class present negative login
 */

public class FailLogin {
	WebDriver driver;

	@BeforeTest
	void invokeBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver",
					"F:\\JAVA\\Java\\workspace\\selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://shop.pragmatic.bg/admin/");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void login() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("parola1231");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		String warning = driver.findElement(By.cssSelector(".panel-body>div")).getText();
		String expected = " Invalid token session. Please login again.";
		Assert.assertFalse(warning.equalsIgnoreCase(expected));
		System.out.println("Invalid username or password, please try again!");

	}

	@AfterTest
	void tearDown() {
		driver.quit();
	}
}
