package bg.pragmatic.lecture4mvn.waits.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WaitForElement implements ExpectedCondition<WebElement>{

	@Override
	public WebElement apply(WebDriver d) {
		return d.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
	}

}
