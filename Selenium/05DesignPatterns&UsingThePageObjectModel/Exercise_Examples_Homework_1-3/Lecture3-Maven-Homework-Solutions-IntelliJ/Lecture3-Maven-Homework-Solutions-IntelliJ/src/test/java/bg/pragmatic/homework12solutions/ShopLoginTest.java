package bg.pragmatic.homework12solutions;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ShopLoginTest {

	WebDriver driver;
	
	@Before
	public void startUp2 (){
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://shop.pragmatic.bg/admin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void logging() {
		driver.findElement(By.xpath("//input[starts-with(@name,'username')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("parola123!");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		Assert.assertTrue("You did not login successfully", driver.getTitle().equalsIgnoreCase("dashboard"));
	}
}
