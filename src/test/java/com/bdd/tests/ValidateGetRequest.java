package com.bdd.tests;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class ValidateGetRequest {

	@Test
	void getRequestTest() {

		given().when().get("https://petstore.swagger.io/v2/store/inventory").then().statusCode(200)
				.statusLine("HTTP/1.1 200 OK").header("content-type", "application/json").assertThat()
				.body("sold", equalTo(1));

	}

}
