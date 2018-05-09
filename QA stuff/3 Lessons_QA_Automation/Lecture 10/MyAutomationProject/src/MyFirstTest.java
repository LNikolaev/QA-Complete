import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {

	@Test
	public void abvSucessfulLogin(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://siteground.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement element : allLinks){
			System.out.println(element.getAttribute("href"));
		}
	}
}
