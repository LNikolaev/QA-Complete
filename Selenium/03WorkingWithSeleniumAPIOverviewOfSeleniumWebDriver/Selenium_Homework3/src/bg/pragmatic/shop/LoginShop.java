package bg.pragmatic.shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginShop {
	WebDriver driver;

	@BeforeTest
	public void invokeBrowser() {
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
	public void login() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("parola123!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("dashboard"), "Invalid login, please try again!");
	}

}
