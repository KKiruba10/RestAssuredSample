package org.loginrest;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample {

	public static void main(String[] args) {
	
		
		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification RequestSpecification = RestAssured.given();
		RequestSpecification.queryParam("page", "2");
		Response response = RequestSpecification.request(Method.GET, "api/users");
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		String asPrettyString = response.getBody().asPrettyString();
		System.out.println(asPrettyString);

		
//		
//		RestAssured.baseURI = "https://reqres.in";
//		RequestSpecification requestSpecification = RestAssured.given();
//		JSONObject jsonobject = new JSONObject();
//		jsonobject.put("name", "morpheus");
//		jsonobject.put("job", "leader");
//		// To attach the payload
//		requestSpecification.body(jsonobject.toJSONString());
//		Response response = requestSpecification.request(Method.POST, "api/users");
//		System.out.println(response.getStatusCode());
//		System.out.println(response.getBody().asPrettyString());
//		
		
		
		

	}

}
