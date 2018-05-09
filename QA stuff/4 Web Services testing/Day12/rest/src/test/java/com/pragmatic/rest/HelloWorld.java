package com.pragmatic.rest;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorld {
	
	@Test
	public void test() {
		int number1 = 1;
		int number2 = 2;

		// Will pass if number1 < number2
		// If number1 >= number2 will fail with specified message
		assertTrue("number2 is not greater than number1", number1 < number2);
		
		// Will pass if two objects are equal
		assertEquals("some value", "some value");
		
		// Force test to fail
		fail("Not yet implemented");
	}
}