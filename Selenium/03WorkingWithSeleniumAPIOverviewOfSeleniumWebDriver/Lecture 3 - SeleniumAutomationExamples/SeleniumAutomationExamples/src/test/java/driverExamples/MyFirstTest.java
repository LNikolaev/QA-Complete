package driverExamples;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

	WebDriver driver;

	@Before
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		this.driver.get("http://abv.bg");
	}

	@Test
	public void myFirstTest() {
		WebElement usernameField = this.driver.findElement(By.id("username"));
		usernameField.sendKeys("dqdo koleda");
	}

	@After
	public void tearDown() throws InterruptedException {
		this.driver.quit();
	}

}
