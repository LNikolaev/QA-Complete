package bg.pragmatic.core.core;

import bg.pragmatic.core.pages.AdminLogin;
import bg.pragmatic.core.pages.AdminCategories;
import bg.pragmatic.core.pages.AdminDashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class App {
	private WebDriver driver;

	public AdminLogin adminLoginPage;
	public AdminDashboard adminDashboard;
	public AdminCategories adminCategories;
	
	public void startBrowser(String pageToOpen) {
		//initialization of the webdriver instance
		String driverPath = null;
		driverPath = Paths.get("chromedriver.exe").toAbsolutePath().toString();
		System.out.println("The taken driver path is: " + driverPath);
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//initialization of all page objects
		adminLoginPage = new AdminLogin(driver);
		adminDashboard = new AdminDashboard(driver);
		adminCategories = new AdminCategories(driver);

		//open the desired page
		driver.get(pageToOpen);
	}

	public void quit() {
		driver.quit();
	}
}
