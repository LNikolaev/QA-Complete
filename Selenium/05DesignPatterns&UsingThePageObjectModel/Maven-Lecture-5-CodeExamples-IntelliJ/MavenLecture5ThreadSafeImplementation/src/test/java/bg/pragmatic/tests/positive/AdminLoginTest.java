package bg.pragmatic.tests.positive;

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
    public void successfulLoginTest() {
        app.adminLoginPage.login(Username.ADMIN_USER, Password.ADMIN_PASSWORD);

        Assert.assertTrue("The loggout button is not displayed", app.adminDashboard.isLogoutButtonDisplayed());
    }
    

    @After
    public void tearDown(){
        app.quit();
    }



}
