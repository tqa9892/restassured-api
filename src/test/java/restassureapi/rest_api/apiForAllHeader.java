package restassureapi.rest_api;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class apiForAllHeader {
	
@Test	
void headerprint () {
	//step1
	RestAssured.baseURI="https://www.google.com/" ;
	//step2
	RequestSpecification httpa = RestAssured.given();
	//step3
	Response reqres = httpa.request(Method.GET,"/search?client=firefox-b-1-d&q=library+near+me&dlnr=1&sei=8oOzY6P-DKTk5NoPkq2buAc");
	//step4
	Headers allheaders=reqres.headers();
	for (Header header:allheaders ) {
		System.out.println(header.getName()+ "--"+ header.getValue());
		
	}
	
	
	String respbody =reqres.getBody().asString();
	int stcode =reqres.getStatusCode();
	//String Contenttype =reqres.header("Content-Type");
	//System.out.println("header is "+Contenttype);
	//Assert.assertEquals(Contenttype, "text/html; charset=ISO-8859-1");
	

	
	//System.out.println("body is"+respbody);
	System.out.println("status code is"+stcode);
	
	
}
}
