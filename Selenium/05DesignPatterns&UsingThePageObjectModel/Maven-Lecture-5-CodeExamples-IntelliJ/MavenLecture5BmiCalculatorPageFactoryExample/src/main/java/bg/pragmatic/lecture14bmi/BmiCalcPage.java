package bg.pragmatic.lecture14bmi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BmiCalcPage {
	
	@FindBy (how = How.ID, using = "heightCMS")
	private WebElement heightCMS;
	@FindBy (how = How.ID, using = "weightKg")
	private WebElement weightKg;
	@FindBy (how = How.ID, using = "Calculate")
	private WebElement calculateButton;
	private WebElement bmi;
	private WebElement bmi_category;
	private WebDriver driver;
	private String url = "http://pragmatic.bg/automation/lecture15/bmicalculator.html";
	
	public BmiCalcPage() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This method fills the height and weight fields and then clicks 
	 * the Calculate button to show u a result
	 * @param height the height you would like to put in the field
	 * @param weight the weight you would to be filled in field
	 */
	public void calculateBmi(String height, String weight) {
		heightCMS.sendKeys(height);
		weightKg.sendKeys(weight);
		calculateButton.click();
	}
	
	/**
	 * @return
	 */
	public String getBmi() {
		return bmi.getAttribute("value");
	}
	
	public String getBmiCategory() {
		return bmi_category.getAttribute("value");
	}
	
	public void quit() {
		this.driver.quit();;
	}

	/**
	 * Use this method to navigate your browser to the
	 * BMI Calculator page, it just opens the page.
	 */
	public void goTo() {
		this.driver.get(this.url);
	}
}
