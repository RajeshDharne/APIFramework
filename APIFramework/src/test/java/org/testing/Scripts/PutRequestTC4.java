package org.testing.Scripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.Propertiesfileload;
import org.testing.Utilities.jsondataload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import ResponseValidation.StatusCodValidation;

public class PutRequestTC4 
{
  @Test	
	public void putrequestusingidTC4() throws IOException
	
	{
		
		Properties p = Propertiesfileload.propertiesload("../APIFramework/URIs.properties");
		String body = jsondataload.jsonfileload("../APIFramework/src/test/java/org/testing/Resources/BodyData.json");
		String idValueforget = PostRequest.idValue;
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getrequest("URIkey", idValueforget);
		StatusCodValidation.ResponseStatuscode(200, res);
		
		System.out.println("Get request is");
		
		System.out.println(res.asString());
		
	}

}
