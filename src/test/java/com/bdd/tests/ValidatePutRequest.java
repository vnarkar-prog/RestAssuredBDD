package com.bdd.tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class ValidatePutRequest {

	@Test
	public void putRequestTest() {

		HashMap map = new HashMap();
		map.put("name", "morpheus");
		map.put("job", "zion resident");

		given().body(map).contentType("application/json")
			.when().put("https://reqres.in/api/users/2")
				.then().statusCode(200).log().all();

	}

}
