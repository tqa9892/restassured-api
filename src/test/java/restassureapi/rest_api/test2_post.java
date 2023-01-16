package restassureapi.rest_api;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class test2_post {
	@Test
	 void apipost () {
		 
		 RestAssured.baseURI ="https://reqres.in/api/users";
		 
		 RequestSpecification httpreq = RestAssured.given();
		 JSONObject jreqpar = new JSONObject ();
		 
		 jreqpar.put("name", "Rpn");
		 jreqpar.put("job", "qa lead");
		 
		// httpreq.header("Content-Type", "application/JSON");
		 httpreq.body(jreqpar.toJSONString());
		 
		 Response respser = httpreq.request(Method.POST);
		 
		 String respbody = respser.getBody().asString();
		 System.out.println(respbody);
		 
		 int statuscode = respser.getStatusCode();
		 System.out.println(statuscode);
		 Assert.assertEquals(statuscode, 201);
		 
		// String successCode =respser.jsonPath().get("Success Code");
		// Assert.assertEquals(successCode, "Operation_success");
		 //System.out.println(successCode);
	 }

}
