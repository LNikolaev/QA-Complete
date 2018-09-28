package seleniumapi;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTests {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://pragmatic.bg/automation/lecture13/DoubleClickDemo.html");
	}
	
	@Test
	public void testElementText()
	{
		//Get the message Element
//		WebElement message = driver.findElement(By.id("message"));

		WebElement message = driver.findElement(By.id("message"));


		//Get the message elements text
		String messageText = message.getText();
		Assert.assertEquals("Abe tva fail-na iimiame bug v edi kvo si",
				"Click on me and my color will change",
				messageText);
		//Verify message element's text displays "Click on me and my color will change"
		//Assert.assertEquals("Click on me and my color will change", messageText);

		//Get the area Element
		WebElement area = driver.findElement(By.id("area"));
		
		//Verify area element's text displays "Div's Text\nSpan's Text"
		Assert.assertEquals("bug beee" , "Div's Text\nSpan's Text", area.getText());
	}
	
	
	@Test
	public void testElementAttribute()
	{
		WebElement message = driver.findElement(By.id("message"));
		String observedAlignment = message.getAttribute("align");
		Assert.assertEquals("justify", observedAlignment);
	}
	
	@Test
	public void testElementStyle()
	{
		WebElement message = driver.findElement(By.id("message"));
		String width = message.getCssValue("width");
		Assert.assertEquals("150px",width);
	}
	
	@AfterClass
	public static void tearDown()
	{
		driver.close();
	}
}