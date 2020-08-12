package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr = pr;
	}
	
	public Response postrequest(String bodydata, String URIkey)
	
	{
		Response res =
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(URIkey));
		System.out.println("status code is");
		System.out.println();
		return res;
	}

public Response getrequest(String URIkey, String idValue)
	
	{
	   //String getURI = pr.getProperty(URIkey)+"/"+idValue;
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/friends");
		System.out.println("status code is");
		System.out.println();
		return res;
	}

public Response GetRequestforalldata(String URIkey)

{
   
	Response res5 =
	given()
	.contentType(ContentType.JSON)
	.when()
	.get(pr.getProperty(URIkey));
	System.out.println("status code is");
	System.out.println();
	return res5;
}

public Response updatedata(String Bodydata, String URIkey, String idValue)

{
   String PutURI = pr.getProperty(URIkey)+"/"+idValue;
	Response res =
	given()
	.contentType(ContentType.JSON)
	.body(Bodydata)
	.when()
	.put(PutURI);
	System.out.println("status code is");
	System.out.println();
	return res;
}
}
