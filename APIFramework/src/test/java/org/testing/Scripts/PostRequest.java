package org.testing.Scripts;


import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.TestSteps.HTTPMethods;
import org.testing.Utilities.JsonVariableReplace;
import org.testing.Utilities.Propertiesfileload;
import org.testing.Utilities.jsondataload;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

import ResponseValidation.ResDataValidationUsingJsonPath;
import ResponseValidation.StatusCodValidation;

public class PostRequest 
{
	
	static String idValue;
	
	@Test
	
	public void TC1 () throws IOException  
	{
		
		Properties p = Propertiesfileload.propertiesload("../APIFramework/URIs.properties");
		
		String body = jsondataload.jsonfileload("../APIFramework/src/test/java/org/testing/Resources/BodyData.json");
		
		System.out.println(body);
		
		Random r = new Random();
		
		Integer RandomValue = r.nextInt();
		
		String bodydataaftergivingvalue =JsonVariableReplace.jsonvaluetovariable(body, "id", RandomValue.toString());	
		
		bodydataaftergivingvalue = JsonVariableReplace.jsonvaluetovariable(bodydataaftergivingvalue, "firstname", "Rohan");
		
		System.out.println(bodydataaftergivingvalue);
		
		HTTPMethods http = new HTTPMethods(p);
		
		Response res3 = http.postrequest(bodydataaftergivingvalue, "URIkey");
		
		StatusCodValidation.ResponseStatuscode(201, res3);
		
		ResDataValidationUsingJsonPath.datavalidationusingjsonpath("Rohan", res3, "firstname");
		
		System.out.println(res3.asString());
		
		idValue = res3.jsonPath().get("id");
		System.out.println("New Id value is ");
		
		System.out.println(idValue);
		
	} 	

}
