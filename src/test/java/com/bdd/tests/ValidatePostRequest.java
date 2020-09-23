package com.bdd.tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;

import org.testng.annotations.Test;

public class ValidatePostRequest {

	@Test
	void postRequestTest() {

		HashMap map = new HashMap();
		map.put("id", "0");
		map.put("username", "Mike@12");
		map.put("firstName", "Mike");
		map.put("lastName", "Smarty");
		map.put("email", "smarty@gmail.com");
		map.put("password", "abc@123");
		map.put("phone", "9898989898");
		map.put("userStatus", "0");

		given().header("content-type", "application/json").body(map)

				.when().post("https://petstore.swagger.io/v2/user")

				.then().statusCode(200).body("sold", hasItems("Test"));

	}

}
