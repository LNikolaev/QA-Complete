package simpleBrowserExamples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleBrowserUpExample {

    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        driver = new ChromeDriver();

//        System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
//
//        System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\MicrosoftWebDriver.exe");
//        driver = new EdgeDriver();
//
//        System.setProperty("webdriver.ie.driver", "C:\\webdrivers\\IEDriverServer.exe");
//        driver = new InternetExplorerDriver();

        driver.get("https://www.abv.bg/");
    }

    @Test
    public void testOne() {
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("pragmabg");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("parola");
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
