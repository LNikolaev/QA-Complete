package bg.pragmatic.shop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NegativeRegister {
	WebDriver driver;

	@BeforeTest
	void invokeBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"D:\\QA\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

			driver.get("http://shop.pragmatic.bg");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void register() {

		driver.findElement(By.xpath("//a[@title='My Account']/span[contains(text(), 'My Account')]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Luben");
		driver.findElement(By.id("input-lastname")).sendKeys("Lubenov");
		driver.findElement(By.id("input-email")).sendKeys();
		driver.findElement(By.id("input-telephone")).sendKeys("0895555555");
		driver.findElement(By.id("input-password")).sendKeys("asd123");
		driver.findElement(By.id("input-confirm")).sendKeys("asd123");

		WebElement radio = driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		verifyRadioButton(radio);
		verifyCheckBox(checkbox);

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String warning = driver.findElement(By.cssSelector("div.text-danger")).getText();

		Assert.assertEquals(warning, "E-Mail Address does not appear to be valid!");

	}

	private void verifyRadioButton(WebElement radio) {
		if (radio.isEnabled()) {
			if (radio.isDisplayed()) {
				if (!radio.isSelected()) {
					radio.click();
				}
			}
		}
	}

	private void verifyCheckBox(WebElement checkbox) {
		if (checkbox.isEnabled()) {
			if (checkbox.isDisplayed()) {
				if (!checkbox.isSelected()) {
					checkbox.click();
				}
			}
		}
	}
}
