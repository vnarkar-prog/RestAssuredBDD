package com.bdd.tests;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SerializationConcept {

	@Test(priority = 1)
	public void serializationTest() {

		Users u = new Users();
		u.setName("Tommy");
		u.setJob("Techie");

		given().contentType("application/json").body(u).when().post("https://bookstore.toolsqa.com/Account/v1/User")
				.then().statusCode(201);

	}

	@Test(priority = 2)
	public void deserializationTest() {

		Users u = get("https://reqres.in/api/users").as(Users.class);
		System.out.println(u.getName());
	}

}
