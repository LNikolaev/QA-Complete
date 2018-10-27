package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;

	/**
	 * A method which is used for openeing a certain browser
	 * 
	 * Example usage: open("chrome"), open("firefox"), open("ie")
	 * 
	 * @param browser based on the provided parameter a browser will be opened
	 */
	public static void open(String browser) {
		switch (browser) {
			case "chrome": {
				System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
				
			}
			
			case "firefox":{
				
			}
			
			case "ie" : {
				
			}

		default: throw new RuntimeException("There is no such browser, take a look at the method javadoc examples");
		}
	}

	/**
	 * Quits the current process of the opened browser
	 */
	public static void quit() {
		driver.quit();
	}

}
