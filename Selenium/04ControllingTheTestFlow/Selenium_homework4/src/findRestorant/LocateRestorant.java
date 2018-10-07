package findRestorant;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LocateRestorant {
	WebDriver driver;

	@Test
	public void testWithWait() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\JAVA\\Java\\SeleniumWorkSpace\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://bgmenu.com");

		driver.findElement(By.name("mysearchstring")).sendKeys("mladost 1, sofiq");

		Wait<WebDriver> wait = new WebDriverWait(driver, 10);

		WebElement searchElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id=\"reference\"][1]")));
		searchElement.click();

		WebElement searchRestourant = wait
				.until(ExpectedConditions.elementToBeClickable(By.linkText("О'шипка|O'shipka")));
		searchRestourant.click();

		assertTrue(driver.getTitle().startsWith("О'шипка|O'ship"));
		System.out.println("Equal Titles!");
	}
}
