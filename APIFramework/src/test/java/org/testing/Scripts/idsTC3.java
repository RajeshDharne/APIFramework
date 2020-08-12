package org.testing.Scripts;

import java.io.IOException;
import java.util.Properties;


import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.ParsingJsonUsingOrgJson;
import org.testing.Utilities.Propertiesfileload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import ResponseValidation.StatusCodValidation;

public class idsTC3 

{
	@Test
	public void TC3() throws IOException
	{
		Properties p = Propertiesfileload.propertiesload("../APIFramework/URIs.properties");
		
		HTTPMethods http = new HTTPMethods(p);
		
		Response res5 = http.GetRequestforalldata("URIkey");
		
		StatusCodValidation.ResponseStatuscode(200, res5);
		
		System.out.println("Third testcase data");
		
		System.out.println(res5.asString());
		
		ParsingJsonUsingOrgJson.JsonExtract(res5.asString(), "firstname");
		
				
	}

}
