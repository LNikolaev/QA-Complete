package bg.pragmatic.tests.negative;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bg.pragmatic.core.core.App;
import enums.Password;
import enums.Username;


public class AdminLoginTest {

    private App app;

    @Before
    public void setup() {
        app = new App();
        app.startBrowser("http://shop.pragmatic.bg/admin");
    }

    @Test
    public void unsuccessfulLoginTest() {
        app.adminLoginPage.login(Username.INVALID_USERNAME, Password.INVALID_PASSWORD);

        Assert.assertTrue(app.adminLoginPage.getValidationError().contains("No match for Username and/or Password."));
    }
    
    @After
    public void tearDown(){
        app.quit();
    }



}
