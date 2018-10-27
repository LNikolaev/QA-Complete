package bg.pragmatic.core.pages;

import enums.Password;
import enums.Username;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import bg.pragmatic.core.pages.base.ParentPage;

public class AdminLogin extends ParentPage{
    private static final By USERNAME_FIELD = By.id("input-username");
    private static final By PASSWORD_FIELD = By.id("input-password");
    private static final By LOGIN_BUTTON = By.cssSelector(".btn-primary");
    private static final By LOGIN_VALIDATION_ERROR = By.cssSelector(".alert-danger");

    public AdminLogin(WebDriver driver) {
        super(driver);
    }

    public void login(Username username, Password password) {
    	type(USERNAME_FIELD, username.getUsername());
        type(PASSWORD_FIELD, password.getPassword());
        click(LOGIN_BUTTON);
    }

    public String getValidationError() {
        return getElementText(LOGIN_VALIDATION_ERROR);
    }
}
