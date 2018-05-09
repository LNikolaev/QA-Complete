package com.pragmatic.telerik;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import java.util.UUID;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.pragmatic.telerik.Objects.CreateUser;
import com.pragmatic.telerik.Objects.CreateUserResponse;

import io.restassured.RestAssured;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TelerikAPI {

	private static final String BASE_URL = "http://api.everlive.com/v1/";
	private static final String APP_ID = "80uc90wdkq8a5l34";
	private static final String API_KEY = "LxzZJJAgUFZAnZIeAhQ3OWR94edOrYV6";
	
	private static String userId;
	
	@BeforeClass
	public static void setup() {
	    RestAssured.baseURI = BASE_URL;
	}
	
	@Test
	public void Test_01_CreateUser() {
		
		/*******************************************************
		 * Auto generate Java objects from Json
		 * http://www.jsonschema2pojo.org/
		 * Notes: Please use Jackson 1.x
		 ******************************************************/
		
		String uniqueID = UUID.randomUUID().toString();
		System.out.println("Random ID: " + uniqueID);
		
		CreateUser user = new CreateUser();
		user.username = "user_" + uniqueID;
		user.displayName = "test";
		user.email = "user_" + uniqueID + "@gmail.com";
		user.password ="test";

		/*******************************************************
		 * Create User
		 ******************************************************/
		
		CreateUserResponse createdUser =
	   	given().
    		contentType("application/json").
    		body(user).
        when().
        	post(APP_ID + "/Users").
        	as(CreateUserResponse.class);

		Assert.assertNotNull(createdUser.result.id);
		userId = createdUser.result.id;
	}

	@Test
	public void Test_02_GetUserDetails() {
		when().
			get(APP_ID + "/Users/" + userId).
		then().
			body("Result.Id", equalTo(userId)).
			body("Result.DisplayName", equalTo("test"));
	}

	@Test
	public void Test_03_GetAllUsers() {
		when().
			get(APP_ID + "/Users").
		then().
			statusCode(200).
			body("Count", greaterThanOrEqualTo(1)).
			body(containsString(userId));
	}
	
	@Test
	public void Test_04_UpdateUser() {		
	   	given().
    		contentType("application/json").
    		header("Authorization", "Masterkey " + API_KEY).
    		body("{\r\n    \"DisplayName\": \"Updated User\"\r\n}").
        when().
        	put(APP_ID + "/Users/" + userId).
        then().
			statusCode(200).
        	body(containsString("ModifiedAt"));
	   	
		when().
			get(APP_ID + "/Users/" + userId).
		then().
			body("Result.Id", equalTo(userId)).
			body("Result.DisplayName", equalTo("Updated User"));
	}
	
	@Test
	public void Test_05_DeleteUser() {
	   	given().
	   		contentType("application/json").
	   		header("Authorization", "Masterkey " + API_KEY).
	   	when().
	   		delete(APP_ID + "/Users/" + userId).
	   	then().
	   		statusCode(200).
	   		body(containsString("Result"));
   	
	   	when().
	   		get(APP_ID + "/Users/" + userId).
	   	then().
	   		statusCode(404);
	}
}
