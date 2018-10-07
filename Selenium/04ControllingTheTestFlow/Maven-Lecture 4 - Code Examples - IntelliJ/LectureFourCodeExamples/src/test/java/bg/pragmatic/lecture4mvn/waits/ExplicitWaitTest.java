package bg.pragmatic.lecture4mvn.waits;
import static org.junit.Assert.*;

import bg.pragmatic.lecture4mvn.waits.utils.WaitForElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import bg.pragmatic.lecture4mvn.waits.utils.WaitTool;

public class ExplicitWaitTest {
 	
	@Test
	public void testExplicitWait()
 	{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://pragmatic.bg/automation/ajax/demo.html");
 		
        try {
 			WebElement page4button = driver.findElement(By.linkText("Page 4"));
 			page4button.click();
 			
 			//first way of explicit custom-wait
 			Wait<WebDriver> wait = new WebDriverWait(driver, 10);
 			WebElement message = wait.until(new WaitForElement());

 			//second way of explicit custom-wait
// 			Wait<WebDriver> wait = new WebDriverWait(driver, 10);
// 			WebElement message = wait.until(new ExpectedCondition<WebElement>() {
//
//				@Override
//				public WebElement apply(WebDriver input) {
//					return driver.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
//				}
//
//			});
 			
 			
// 			WebElement message = WaitTool.waitForElementPresent(driver, By.xpath("//div[contains(text(),'Nunc nibh tortor')]"), 5);
 			
 			assertTrue(message.getText().contains("Nunc nibh tortor"));

 			
 		} catch (NoSuchElementException e) {
 			fail("Element not found!!");
 			e.printStackTrace(); 
 		} finally {
 			driver.quit();
 		}
 	}
	
	
	@Test
	public void testExplicitWaitByTitle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("http://www.google.com");
		 
		 WebElement query = driver.findElement(By.name("q"));
		 query.sendKeys("selenium");
		 query.submit();
		 		 
		 (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			 public Boolean apply(WebDriver d) {
				 return d.getTitle().toLowerCase().startsWith("selenium");
		 }});

		 assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));

		 driver.quit();
	}
	
	@Test
	public void testExplicitWaitTitleContains()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	
		//Enter a term to search and submit
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("selenium");
		query.submit();
		//Create Wait using WebDriverWait. 
		//This will wait for 10 seconds for timeout before title is updated with search term
		//If title is updated in specified time limit test will move to the text step 
		//instead of waiting for 10 seconds
		Wait<WebDriver> wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("selenium"));
		
		//Verify Title
		assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
		
		driver.quit();
	}
}
