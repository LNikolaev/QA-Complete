package bg.pragmatic.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownOrders {
	WebDriver driver;

	@BeforeTest
	void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"F:\\JAVA\\Java\\SeleniumWorkSpace\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://shop.pragmatic.bg/admin/");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1)
	void login() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("parola123!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("dashboard"), "Invalid login, please try again!");
	}

	@Test(dependsOnMethods = ("login"))
	void ordersDropdown() {
		driver.findElement(By.xpath("//ul[@id='menu']/li[5]")).click();
		driver.findElement(By.xpath("//li[@id='menu-sale']/ul/li[1]")).click();

		List<String> actual = new ArrayList<>();

		List<String> expected = Arrays.asList("", "Missing Orders", "Canceled", "Canceled Reversal", "Chargeback",
				"Complete", "Denied", "Expired", "Failed", "Pending", "Processed", "Processing", "Refunded", "Reversed",
				"Shipped", "Voided");

		Select make = new Select(driver.findElement(By.tagName("select")));

		// fill the actual
		for (WebElement option : make.getOptions()) {
			actual.add(option.getText());
		}

		dropDownEqualArraysValues(actual, expected);
	}

	@AfterTest
	void tearDown() {
		driver.quit();
	}

	private void dropDownEqualArraysValues(List<String> actual, List<String> expected) {
		try {
			Assert.assertEquals(actual, expected);
		} catch (AssertionError e) {
			System.out.println("Different elements or size in dropdown");
			throw e;
		}
	}
}
