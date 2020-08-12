package ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResDataValidationUsingJsonPath 

{
	
	public static void datavalidationusingjsonpath(String ExpectedResponse, Response res, String jsonpath)
	
	{
		String actualdata = res.jsonPath().getString(jsonpath);
		
		Assert.assertEquals(ExpectedResponse, actualdata,  "Data is not matching" );
	}

}
