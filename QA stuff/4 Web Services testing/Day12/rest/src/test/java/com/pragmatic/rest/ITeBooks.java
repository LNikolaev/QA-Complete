package com.pragmatic.rest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class ITeBooks {

	private static String baseURL = "http://it-ebooks-api.info/v1/";

	@Rule
	public TestName testName = new TestName();

	@BeforeClass
	public static void runBeforeClass() {
		System.out.println("Start tests in ITeBooks class.");
	}

	@AfterClass
	public static void runAfterClass() {
		System.out.println("End tests in ITeBooks class.");
	}

	@Before
	public void setUp() {
		System.out.println("Start test: " + testName.getMethodName());
	}

	@After
	public void tearDown() {
		System.out.println("End test: " + testName.getMethodName());
	}

	@Test
	public void GetBookDetails() {

		String id = 
		
		when()
			.get(baseURL + "book/{id}", "2279690981")
		.then()
			.statusCode(200)
			.contentType("application/json")
			.time(lessThan(3000L), TimeUnit.MILLISECONDS)
			.body(containsString("2279690981"))
		.extract()
			.path("ID").toString();
		
		Assert.assertEquals("Id is not correct", "2279690981", id);		
	}

	@Test
	public void SearchForBook() {
		when()
			.get(baseURL + "search/{seachString}", "selenium")
		.then()
			.statusCode(200)
			.body(containsString("selenium"))
			.body("Books[0].Title", equalTo("Selenium 1.0 Testing Tools"));
	}
}
