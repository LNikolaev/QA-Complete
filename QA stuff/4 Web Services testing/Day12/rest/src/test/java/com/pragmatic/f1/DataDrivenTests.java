package com.pragmatic.f1;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class DataDrivenTests {

    private String circuitName;
    private String circuitCountry;
 
    public DataDrivenTests(String circuitName, String circuitCountry) {
        this.circuitName = circuitName;
        this.circuitCountry = circuitCountry;
    }
    
	/*******************************************************
	 * Create a DataProvider that specifies in which country
	 * a specific circuit can be found (specify that Monza 
	 * is in Italy, for example) 
	 ******************************************************/
	
	@Parameters
	public static String[][] data() {
		return new String[][] { 
			{ "monza", "Belgium" }, 
			{ "spa", "Italy" }, 
			{ "sepang", "Malaysia" } 
			};
	}

	/*******************************************************
	 * Request data for a specific circuit (for Monza this 
	 * is http://ergast.com/api/f1/circuits/monza.json)
	 * and check the country this circuit can be found in
	 ******************************************************/
	
	@Test
	public void test() {
		
		given().
			pathParam("circuitName", circuitName).
		when().
			get("http://ergast.com/api/f1/circuits/{circuitName}.json").
		then().
			assertThat().
			body("MRData.CircuitTable.Circuits.Location[0].country",equalTo(circuitCountry));
	}

	// More on JUnit data driven testing: http://blog.codeleak.pl/2013/12/parametrized-junit-tests-with.html
	// Tips: Try TestNG, it is much easier for data-driven tests
}
