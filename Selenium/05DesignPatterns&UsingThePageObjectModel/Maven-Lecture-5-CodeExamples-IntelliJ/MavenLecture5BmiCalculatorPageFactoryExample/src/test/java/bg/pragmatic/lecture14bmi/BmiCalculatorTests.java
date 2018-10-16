package bg.pragmatic.lecture14bmi;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;

public class BmiCalculatorTests {

	@Test
	public void calculateOverweightBmiTest() {
		BmiCalcPage bmiPage = new BmiCalcPage();
		
		bmiPage.goTo();
		bmiPage.calculateBmi("188", "90");
		
		Assert.assertEquals("25.5", bmiPage.getBmi());
		Assert.assertEquals("Overweight", bmiPage.getBmiCategory());
		
		bmiPage.quit();
	}

	@Test
	public void calculateOverweightBmiTest2() {
		BmiCalcPage bmiPage = new BmiCalcPage();
		
		bmiPage.goTo();
		bmiPage.calculateBmi("158", "90");
		
		Assert.assertEquals("36.1", bmiPage.getBmi());
		Assert.assertEquals("Obesity", bmiPage.getBmiCategory());
		bmiPage.quit();
	}

}
