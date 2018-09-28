package driverExamples;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.junit.*;



public class InstallingFirefoxAddon {
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		File file = new File ("C:/webdrivers/FireFoxAddons/katalon_recorder_selenium_ide_code_export-3.6.11-an+fx-windows.xpi");
		profile.addExtension(file);
		options.setProfile(profile);
	    driver = new FirefoxDriver(options);
	    driver.get("http://pragmatic.bg/automation/example4.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
	    driver.quit();
	}
	
	@Test
	public void testExamples()  {
	    WebElement element = driver.findElement(By.id("nextBid"));
	    element.sendKeys("100");
	}
}
