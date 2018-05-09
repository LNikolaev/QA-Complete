package com.pragmatic.telerik;

import static io.restassured.RestAssured.expect;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import java.util.UUID;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pragmatic.telerik.Objects.CreateUser;
import com.pragmatic.telerik.Objects.CreateUserResponse;

import io.restassured.RestAssured;

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
	public void CreateUser() {
		
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
		 * If you just want to get body and print it
		 ******************************************************/
		
		//Response r = 
		//
    	//given().
    	//	contentType("application/json").
    	//	body(user).
        //when().
        //	post(APP_ID + "/Users");
		//
    	//String body = r.getBody().asString();
    	//System.out.println(body);
		
		/*******************************************************
		 * Create User
		 ******************************************************/
		
		//CreateUserResponse createdUser =
		String body = 
    	given().
    		contentType("application/json").
    		body(user).
        when().
        	post(APP_ID + "/Users").
        	//as(CreateUserResponse.class)
        	getBody().asString();
		System.out.println(body);
		//Assert.assertNotNull(createdUser.id);
		//userId = createdUser.id;
	}

	@Test
	public void GetUserDetails() {
		when().
			get("Users/" + userId).
		then().
			body("Result.Id", equalTo(userId));
	}

	@Test
	public void GetAllUsers() {
		expect().
			statusCode(200).
			body("Count", greaterThanOrEqualTo(3)).
		when().
			get(APP_ID + "/Users");
	}
}
