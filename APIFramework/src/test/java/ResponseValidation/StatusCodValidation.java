package ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class StatusCodValidation 
{
	
	public static void ResponseStatuscode(int Expected_Status, Response res)
{
		
		Assert.assertEquals(Expected_Status ,res.statusCode(),  "Data is not matching");
		
		System.out.println(res.statusCode());
}

}
