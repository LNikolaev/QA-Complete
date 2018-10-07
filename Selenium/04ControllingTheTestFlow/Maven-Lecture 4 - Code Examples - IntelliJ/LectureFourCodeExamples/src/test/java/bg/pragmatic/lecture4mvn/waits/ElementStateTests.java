package bg.pragmatic.lecture4mvn.waits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElementStateTests {

    private static WebDriver driver;
    
    @BeforeClass
    public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
    }
    
 	@Test
    public void testElementIsEnabled()
    {
 		//Get the Checkbox as WebElement using it's name attribute
 		WebElement ledheadlamp = driver.findElement(By.xpath("//input[@name='ledheadlamp']"));

 		//Check if its enabled before selecting it
 		if (ledheadlamp.isEnabled())
 		{
 			//Check if its already selected? otherwise select the Checkbox
 			if (!ledheadlamp.isSelected())
 				ledheadlamp.click();
 		}
 		else
 		{
 			fail("LED Lamp Checkbox is disabled!!");
 		}
    }
 	
 	@Test
 	public void testIsEclementPresent() 
 	{
 		//Check if element with locator criteria exists on Page
 		if (isElementPresent(By.name("airbags"))) {
 			//Get the checkbox and select it
 			WebElement airbag = driver.findElement(By.name("airbags"));
 			
 			if (!airbag.isSelected()) {
 				airbag.click();
 			}
 			
 		}
 		else {
 			fail("Airbag Checkbox doesn't exists!!");
 		}
 	}
 	
 	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
 	}
 	
 	@AfterClass
    public static void tearDown() {
        driver.close();
        driver.quit();
    }
 	

 	
}