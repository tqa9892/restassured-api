package restassureapi.rest_api;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC_1_Authorization {
@Test	
void authorizationget () {
	//specify base url
		RestAssured.baseURI="https://reqres.in/api/users?" ;
		//request object created 
		RequestSpecification httpReq = RestAssured.given();
		// response object created
		Response responsesp =httpReq.request(Method.GET,"/3");
		
		String responsepr = responsesp.getBody().asString();
		System.out.println("response is :"+responsepr);
	int statuscode =	responsesp.getStatusCode();
		System.out.println("Code is:"+statuscode);
	Assert.assertEquals(statuscode, 200);
	
		
	}

}
