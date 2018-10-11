package bg.pragmatic.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * @author Lubo
 * This class present multiple choice on dropdown, and check that our custom options is selected.
 */
public class multipleColorSellect {	
	
	WebDriver driver;

	@BeforeTest
	void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"F:\\JAVA\\Java\\SeleniumWorkSpace\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://pragmatic.bg/automation/lecture13/Config.html");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void multipleSelect() {
		WebElement findElement = driver.findElement(By.name("color"));
		Select dropdown = new Select(findElement);
		Actions builder = new Actions(driver);
		List<String> expected = Arrays.asList("Red", "Silver");
		
		List<String> actual = new ArrayList<>();
		
		
		if (dropdown.isMultiple()) {
			dropdown.deselectAll();
		}
		builder.keyDown(Keys.CONTROL)
		.click(dropdown.getOptions().get(2))
		.click(dropdown.getOptions().get(4))
		.keyUp(Keys.CONTROL);

		builder.build().perform();
		
		// fill the actual with selected options
		for(WebElement option : dropdown.getAllSelectedOptions()) {
    		actual.add(option.getText());
		}
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		dropDownEqualArraysValues(actual, expected);
		System.out.println("Equal selected values");
	}
	
	@AfterTest
	void tearDown() {
		driver.quit();
	}
	
	/**
	 * The method compare the values of two arrays
	 * @param actual from html select
	 * @param expected our expecred options
	 */
	private void dropDownEqualArraysValues(List<String> actual, List<String> expected) {
		try {
			Assert.assertEquals(actual, expected);
		} catch (AssertionError e) {
			System.out.println("Different elements or size in dropdown");
			throw e;
		}
	}
	
}
