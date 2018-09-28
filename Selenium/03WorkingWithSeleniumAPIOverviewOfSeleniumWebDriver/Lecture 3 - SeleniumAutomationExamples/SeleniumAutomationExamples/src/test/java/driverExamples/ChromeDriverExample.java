package driverExamples;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.*;


public class ChromeDriverExample {
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		options.addArguments("--start-maximized", "--disable-extensions");
		driver = new ChromeDriver(options);
		driver.get("http://pragmatic.bg/automation/example4.html");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testExamples() {
		WebElement element = driver.findElement(By.id("selectLoad"));
		String value = element.getAttribute("value");
		Assert.assertEquals("Click to load the select below", value);
	}
}