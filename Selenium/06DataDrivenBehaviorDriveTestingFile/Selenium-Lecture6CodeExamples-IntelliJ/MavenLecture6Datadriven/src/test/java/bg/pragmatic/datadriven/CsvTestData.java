package bg.pragmatic.datadriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

@RunWith(Parameterized.class)
public class CsvTestData {

	private static WebDriver driver;

	private String height;
	private String weight;
	private String bmi;
	private String bmiCategory;

	@Parameters
	public static Collection<String[]> testData() throws IOException {
		return getTestData(
				"C:\\Users\\georg\\OneDrive\\01Kursove - Pragmatic\\Automation QA Course\\Georgi Tsvetanov Automation Course\\Selenium Module\\Lecture 6\\Files in use\\data.csv");
	}

	public CsvTestData(String height, String weight, String bmi, String bmiCategory) {
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.bmiCategory = bmiCategory;
	}

	public static Collection<String[]> getTestData(String fileName) throws IOException {
		List<String[]> records = new ArrayList<String[]>();
		String record;

		BufferedReader file = new BufferedReader(new FileReader(fileName));
		while ((record = file.readLine()) != null) {
			String fields[] = record.split(",");
			records.add(fields);
		}

		file.close();
		return records;
	}

	@BeforeClass
	public static void setUp() throws Exception {
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://pragmatic.bg/automation/lecture15/bmicalculator.html");
	}

	@Test
	public void testBMICalculator() throws Exception {
		WebElement heightField = driver.findElement(By.name("heightCMS"));
		heightField.clear();
		heightField.sendKeys(this.height);

		WebElement weightField = driver.findElement(By.name("weightKg"));
		weightField.clear();
		weightField.sendKeys(this.weight);

		WebElement calculateButton = driver.findElement(By.id("Calculate"));
		calculateButton.click();

		WebElement bmiLabel = driver.findElement(By.name("bmi"));
		assertEquals(this.bmi, bmiLabel.getAttribute("value"));

		WebElement bmiCategoryLabel = driver.findElement(By.name("bmi_category"));
		assertEquals(this.bmiCategory, bmiCategoryLabel.getAttribute("value"));

	}

	@AfterClass
	public static void tearDown() throws Exception {
		// Close the browser
		driver.quit();
	}
}
