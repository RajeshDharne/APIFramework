package org.testing.Scripts;

import java.io.FileNotFoundException;
import org.testing.Utilities.JsondataupdateusingorgJson;
import org.testing.Utilities.jsondataload;
import org.testng.annotations.Test;

public class TC6_ReadJsonFile 

{
	
	@Test
	
	public static void main(String[] args) throws FileNotFoundException 
		
	{
		
		String s = jsondataload.jsonfileload("../APIFramework/src/test/java/org/testing/Resources/DummyData.json");
		
		s = JsondataupdateusingorgJson.JsondataUpdate(s, "type", "POCO2");
		
		s = JsondataupdateusingorgJson.JsondataUpdate(s, "number", "9978945634");
		
		System.out.println(s);
		
		
		
	}
	
	

}
