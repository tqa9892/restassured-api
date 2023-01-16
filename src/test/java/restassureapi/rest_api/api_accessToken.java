package restassureapi.rest_api;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api_accessToken {
	
	@Test
	public void accessToken1 () {
		Response resp1 = RestAssured.given()
	  .formParam("clientName", "Postman")
	  .formParam("clientEmail", "13211sabbir@example.com")
	.post("https://simple-books-api.glitch.me/api-clients/");	
		//System.out.println(resp1.jsonPath().prettify());
		System.out.println(resp1.jsonPath().get("accessToken"));
	}
}
