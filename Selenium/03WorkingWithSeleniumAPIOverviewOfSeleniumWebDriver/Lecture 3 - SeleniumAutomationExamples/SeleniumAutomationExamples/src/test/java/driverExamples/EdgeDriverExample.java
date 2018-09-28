package driverExamples;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeDriverExample {
	WebDriver driver;

	@Before
	public void setUp(){
		System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://abv.bg");
	}

	@Test
	public void testExamples(){
		WebElement usernameInput = driver.findElement(By.id("username"));
		usernameInput.sendKeys("pragmabg");
		WebElement passwordInput = driver.findElement(By.id("password"));
		passwordInput.sendKeys("parola");
		driver.findElement(By.id("loginBut")).click();
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
}
