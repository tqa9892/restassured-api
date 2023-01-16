package restassureapi.rest_api;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_1_JSONValidation {
	@Test
	 void apipost () {
		 
		 RestAssured.baseURI ="https://reqres.in/api/users/";
		 
		 RequestSpecification httpreq = RestAssured.given();
	
	
		 
		 Response respser = httpreq.request(Method.GET,"/2");
		 
		 String respbody = respser.getBody().asString();
		 System.out.println(respbody);
		 
		 int statuscode = respser.getStatusCode();
		 System.out.println(statuscode);
		 Assert.assertEquals(statuscode, 200);
		 Assert.assertEquals(respbody.contains("Janet"), true);
		 
		// String successCode =respser.jsonPath().get("Success Code");
		// Assert.assertEquals(successCode, "Operation_success");
		 //System.out.println(successCode);
	 }

}
