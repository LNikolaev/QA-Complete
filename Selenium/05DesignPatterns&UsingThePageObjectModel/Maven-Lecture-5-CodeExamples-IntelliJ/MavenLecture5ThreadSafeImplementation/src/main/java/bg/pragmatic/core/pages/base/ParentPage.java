package bg.pragmatic.core.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParentPage {

    protected WebDriver driver;

    public ParentPage(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }

    protected void type(By locator, String textToType) {
        driver.findElement(locator).sendKeys(textToType);
    }

    protected boolean isDisplayed(By locator) {
        return !driver.findElements(locator).isEmpty();
    }

    protected String getElementText(By locator) {
        return driver.findElement(locator).getText();
    }

}