package driverExamples;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.junit.Test;


public class OurSecondExampleClass {
	WebDriver driver;
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://pragmatic.bg/automation/example4.html");
		options.setProfile(profile);
	    driver = new FirefoxDriver(options);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown(){
	    driver.quit();
	}
	
	@Test
	public void testExamples(){
		driver.findElement(By.xpath("//div"));
	    WebElement element = driver.findElement(By.linkText("Index"));
	    element.click();
	}


}
