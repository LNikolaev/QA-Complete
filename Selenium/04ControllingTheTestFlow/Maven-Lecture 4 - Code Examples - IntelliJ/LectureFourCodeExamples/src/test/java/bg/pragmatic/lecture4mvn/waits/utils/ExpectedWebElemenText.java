package bg.pragmatic.lecture4mvn.waits.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class ExpectedWebElemenText implements ExpectedCondition<String>{

	public String apply(WebDriver driver) {
		WebElement foundElement = driver.findElement(By.xpath("//div[contains(text(),'Nunc nibh tortor')]"));
		return foundElement.getText();
	}

}
