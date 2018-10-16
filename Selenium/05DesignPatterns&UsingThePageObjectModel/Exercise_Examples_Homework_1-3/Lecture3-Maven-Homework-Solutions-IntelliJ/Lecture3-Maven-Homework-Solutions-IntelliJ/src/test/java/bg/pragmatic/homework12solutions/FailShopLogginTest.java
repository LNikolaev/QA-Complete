package bg.pragmatic.homework12solutions;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FailShopLogginTest {

	WebDriver driver;

	@Before
	public void startUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://shop.pragmatic.bg/admin");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//input[starts-with(@name,'username')]")).sendKeys("admin1");
		driver.findElement(By.xpath("//input[starts-with(@name,'password')]")).sendKeys("parola1");
		driver.findElement(By.cssSelector(".btn-primary")).click();
		WebElement fail = driver.findElement(By.cssSelector("div.alert-danger"));

		assertTrue(fail.getText().contains("No match for Username and/or Password."));
	}

}