package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class test {
public static void main(String[] args) {
	
		   //String getURI = pr.getProperty(URIkey)+"/"+idValue;
			Response res =
			given()
			.contentType(ContentType.JSON)
			.when()
			.get("http://localhost:3000/friends");
			System.out.println("status code is");
			System.out.println();
			System.out.println(res);
		
}
}
