package restassureapi.rest_api;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_1_JSONPathinConsol {
	@Test
	void apipost() {

		RestAssured.baseURI = "https://reqres.in/api/users/";

		RequestSpecification httpreq = RestAssured.given();

		Response respser = httpreq.request(Method.GET, "/2");
		JsonPath jsonpath = respser.jsonPath();

		System.out.println(jsonpath.get("data"));
		System.out.println(jsonpath.get("support"));
//		System.out.println(jsonpath.get("avatar"));
//		System.out.println(jsonpath.get("id"));
//		 

		// String respbody = respser.getBody().asString();
		// System.out.println(respbody);

	}

}
