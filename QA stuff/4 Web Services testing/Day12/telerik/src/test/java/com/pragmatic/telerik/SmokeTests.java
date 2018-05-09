package com.pragmatic.telerik;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.pragmatic.objects.CreateUser;

import io.restassured.RestAssured;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmokeTests {

	private static final String BASE_URL = "http://api.everlive.com/v1/";
	private static final String APP_ID = "80uc90wdkq8a5l34";
	private static final String API_KEY = "LxzZJJAgUFZAnZIeAhQ3OWR94edOrYV6";
	private static final String userId = UUID.randomUUID().toString();
	private static String createUserId = "";
	
	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = BASE_URL + APP_ID;
	}
	
	@Test
	public void test_01_createValidUser() {
		
		CreateUser body = new CreateUser();
		body.displayName = "User";
		body.email = "user_" + userId + "@gmail.com";
		body.password = "123456";
		body.username = "user" + userId;
		
		String id = 
		given().
			header("Content-Type","application/json").
			body(body).
		when().
			post("/Users").
		then().
			statusCode(201).
		extract().
			path("Result.Id");
		createUserId = id;
	}
	
	@Test
	public void test_02_getValidUserShouldReturnUserDetails() {
		when().
			get("/Users/{id}", createUserId).
		then().
			statusCode(200).
			body(containsString(createUserId));
	}
	
	@Test
	public void test_03_getNotExistingUserShouldReturn404() {
		when().
			get("/Users/{id}", UUID.randomUUID().toString()).
		then().
			statusCode(404);
	}
	
	@Test
	public void test_04_getAllUsersShouldReturnResult() {
		when().
			get("/Users").
		then().
			statusCode(200).
			body("Count", greaterThanOrEqualTo(1)).
			body(containsString(createUserId));
	}
	
	@Test
	public void test_05_createUserWithInvalidEmail() {
		CreateUser body = new CreateUser();
		body.displayName = "User";
		body.email = "invaliduser_" + userId + "gmail.com";
		body.password = "123456";
		body.username = "invaliduser" + userId;
		
		given().
			header("Content-Type","application/json").
			body(body).
		when().
			post("/Users").
		then().
			statusCode(400).
			body("message", equalTo("The specified email value is not a valid email address."));
	}
	
	@Test
	public void test_06_createAlreadyExistingUser() {
		CreateUser body = new CreateUser();
		body.displayName = "User";
		body.email = "user_" + userId + "@gmail.com";
		body.password = "123456";
		body.username = "user" + userId;
		
		given().
			header("Content-Type","application/json").
			body(body).
		when().
			post("/Users").
		then().
			statusCode(400).
			body(containsString("A user with the same username already exists"));
	}
	
	@Test
	public void test_07_updateValidUser() {
		
		CreateUser body = new CreateUser();
		body.displayName = "Updated User";
		
		given().
			contentType("application/json").
			header("Authorization", "Masterkey " + API_KEY).
			body(body).
		when().
			put("/Users/" + createUserId).
		then().
			statusCode(200);
		
		when().
			get("/Users/{id}", createUserId).
		then().
			statusCode(200).
			body(containsString("Updated User"));
	}
	
	@Test
	public void test_08_updateNotExistingUser() {
		
		CreateUser body = new CreateUser();
		body.displayName = "Updated User";
		body.password = "654321";
		
		given().
			contentType("application/json").
			header("Authorization", "Masterkey " + API_KEY).
		body(body).
		when().
			put("/Users/" + UUID.randomUUID().toString()).
		then().
			statusCode(404);
	}
	
	@Test
	public void test_09_updateUserWithoutAuthentication() {
		CreateUser body = new CreateUser();
		body.displayName = "Updated User";
		body.password = "654321";
		
		given().
			contentType("application/json").
			body(body).
		when().
			put("/Users/" + createUserId).
		then().
			statusCode(403);
	}
	
	@Test
	public void test_10_deleteValidUser() {
		given().
			contentType("application/json").
			header("Authorization", "Masterkey " + API_KEY).
		when().
			delete("/Users/" + createUserId).
		then().
			statusCode(200);
		
		when().
			get("/Users/{id}", createUserId).
		then().
			statusCode(404);
	}
	
	@Test
	public void test_11_deleteUserWithoutAuthentication() {
		given().
			contentType("application/json").
		when().
			delete("/Users/" + createUserId).
		then().
			statusCode(403);
	}
}
