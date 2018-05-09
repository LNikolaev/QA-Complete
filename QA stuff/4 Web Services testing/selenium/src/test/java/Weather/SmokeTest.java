package Weather;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void verifyTemperatureInSofia() throws InterruptedException {
        driver.navigate().to("http://openweathermap.org/find?q=Sofia");
        String temperatureString = driver
                .findElement(By.xpath("//*[@id=\"forecast_list_ul\"]/table/tbody/tr/td[2]/p[1]/span"))
                .getText();
        Double temperature = Double.valueOf(temperatureString.substring(0, temperatureString.indexOf(".") + 1));
        Assert.assertTrue("Temperature is too high", 30 >= temperature);
        Assert.assertTrue("Temperature is too low", 10 <= temperature);
    }
}
