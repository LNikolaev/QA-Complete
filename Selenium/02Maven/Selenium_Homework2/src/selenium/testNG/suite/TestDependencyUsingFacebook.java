package selenium.testNG.suite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestDependencyUsingFacebook {

	WebDriver driver;

	@Test
	public void openBrowser() {
		try {
			System.setProperty("webdriver.gecko.driver",
					"F:\\JAVA\\Java\\workspace\\selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://www.facebook.com");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(dependsOnMethods = ("openBrowser"))
	public void loginToFacebook() {
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).submit();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
