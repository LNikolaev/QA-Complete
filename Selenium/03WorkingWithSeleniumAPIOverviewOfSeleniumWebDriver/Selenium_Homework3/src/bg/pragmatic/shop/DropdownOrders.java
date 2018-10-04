package bg.pragmatic.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownOrders {
	WebDriver driver;

	@BeforeTest
	public void invokeBrowser() {
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
	public void login() {
		driver.findElement(By.id("input-username")).sendKeys("admin");
		driver.findElement(By.id("input-password")).sendKeys("parola123!");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Assert.assertTrue(driver.getTitle().equalsIgnoreCase("dashboard"), "Invalid login, please try again!");
	}
	
	@Test(dependsOnMethods = ("login"))
	public void ordersDropdown() {
		driver.findElement(By.xpath("//ul[@id='menu']/li[5]")).click();
		driver.findElement(By.xpath("//li[@id='menu-sale']/ul/li[1]")).click();
		/*driver.findElement(By.tagName("select")).click();*/
		/*List<String> options = driver.findElement(By.tagName("//select/option"));*/
		
		Select make = new Select(driver.findElement(By.tagName("select")));
		List<String> options = new ArrayList<>();
		for (WebElement option : make.getOptions()) {
			options.add(option.getText());
		}
		for (String string : options) {
			System.out.println(string + " ");
		}
		
		/*
		 * List<String> exp_options = Arrays.asList(new String[]{"Today", "This Week",
		 * "This Month","This Year"}); List<String> act_options = new
		 * ArrayList<String>(); for(WebElement option : make.getOptions())
		 * act_options.add(option.getText());
		 * assertArrayEquals(exp_options.toArray(),act_options.toArray());
		 */
	}
}
