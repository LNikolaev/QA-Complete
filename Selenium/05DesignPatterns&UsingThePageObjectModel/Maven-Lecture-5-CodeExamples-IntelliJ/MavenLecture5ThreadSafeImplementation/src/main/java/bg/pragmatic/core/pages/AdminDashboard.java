package bg.pragmatic.core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import bg.pragmatic.core.pages.base.ParentPage;

public class AdminDashboard extends ParentPage {
    public final static By LOGOUT_BUTTON = By.xpath("//i[contains(@class,'fa-sign-out')]/following-sibling::span");

    public AdminDashboard(WebDriver driver) {
        super(driver);
    }

    public boolean isLogoutButtonDisplayed() {
        return isDisplayed(LOGOUT_BUTTON);
    }

}
