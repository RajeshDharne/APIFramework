package org.testing.Scripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.Propertiesfileload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import ResponseValidation.StatusCodValidation;

public class GetRequestTC2 
{
	@Test
	public void getrequestforidTC2() throws IOException
	
	{
		
		Properties p = Propertiesfileload.propertiesload("../APIFramework/URIs.properties");
		String idValueforget = PostRequest.idValue;
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.getrequest("URIkey", idValueforget);
		StatusCodValidation.ResponseStatuscode(200, res);
		
		System.out.println("Get request is");
		
		System.out.println(res.asString());
		
	}

}
