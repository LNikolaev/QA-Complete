package waits;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {
 	
	@Test
	public void testExplicitWait()
 	{
 		WebDriver driver = new FirefoxDriver();
        driver.get("http://pragmatic.bg/automation/ajax/demo.html");
 		
        try {
 			WebElement page4button = driver.findElement(By.linkText("Page 4"));
 			page4button.click();
 		
// 			Wait<WebDriver> wait = new WebDriverWait(driver, 10);
// 			WebElement theMessage = wait.until(new ExpectedCondition<WebElement>() {
//				@Override
//				public WebElement apply(WebDriver d) {
//					return d.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
//				}
//			});
 			
 			WebElement message = (new WebDriverWait(driver, 5))
 					  .until(new ExpectedCondition<WebElement>(){
 						@Override
 						public WebElement apply(WebDriver d) {
 							return d.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
 						}});
 			assertTrue(message.getText().contains("Nunc nibh tortor"));
 			
 		} catch (NoSuchElementException e) {
 			fail("Element not found!!");
 			e.printStackTrace();
 		} finally {
 			driver.close();
 		}
 	}
	
	
	@Test
	public void testExplicitWaitByTitle()
	{
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.google.us");
		 
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
		//Go to the Google Home Page
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.us");
	
		//Enter a term to search and submit
		WebElement query = driver.findElement(By.name("q"));
		query.sendKeys("selenium");
		query.submit();
		
		//Create Wait using WebDriverWait. 
		//This will wait for 10 seconds for timeout before title is updated with search term
		//If title is updated in specified time limit test will move to the text step 
		//instead of waiting for 10 seconds
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("selenium"));

		//Verify Title
		assertTrue(driver.getTitle().toLowerCase().startsWith("selenium"));
		
		driver.quit();
	}
	
	
}
