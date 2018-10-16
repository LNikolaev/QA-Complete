package bg.pragmatic.homework12solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectTest {
	
	WebDriver driver;
	
	@Before
	public void startUp (){
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://pragmatic.bg/automation/lecture13/Config.html");
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void multipleSelectTest() {
		
		Select allColors = new Select(driver.findElement(By.name("color"))); 
		
		Actions builder = new Actions(driver);
		
		builder
			.keyDown(Keys.CONTROL)
			.click(driver.findElement(By.xpath("//option[@value='rd']")))
			.click(driver.findElement(By.xpath("//option[@value='sl']")))
			.keyUp(Keys.CONTROL)
			.perform();
		
		List<WebElement> allSelectedOptions = allColors.getAllSelectedOptions();
		List<String> actualSelectedOptions = new ArrayList<>();
				
 		for (WebElement curSelectedOption: allSelectedOptions) {
			actualSelectedOptions.add(curSelectedOption.getText());
		}
		
		
 		String[] expectedSelectedOptions = { "Red", "Silver" };
		
		Assert.assertArrayEquals(expectedSelectedOptions, actualSelectedOptions.toArray());
		
	}

}
