package playground;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFristTest {

	WebDriver driver;
	
	@Before
	public void init(){
		System.setProperty("webdriver.gecko.driver", "E:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void myFirstTest(){
		driver.get("http://abv.bg");
	}
	
	@Test
	public void mySecondTest(){
		driver.get("http://google.com");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
}
