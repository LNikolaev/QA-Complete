package com.pragmatic.rest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ITeBooks.class, HelloWorld.class })
public class AllTests {

	@BeforeClass
	public static void runBeforeClass() {
		System.out.println("AllTests Suite @BeforeClass");
	}

	@AfterClass
	public static void runAfterClass() {
		System.out.println("AllTests Suite @AfterClass");
	}
}
