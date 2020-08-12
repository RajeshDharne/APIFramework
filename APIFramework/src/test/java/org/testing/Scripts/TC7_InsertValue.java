package org.testing.Scripts;

import java.io.FileNotFoundException;

import org.testing.Utilities.JsondataupdateusingorgJson;
import org.testing.Utilities.jsondataload;
import org.testng.annotations.Test;

public class TC7_InsertValue 

{
	
	@Test
	
	public static void main(String[] args) throws FileNotFoundException 
	
	{
		
		String s = jsondataload.jsonfileload("../APIFramework/src/test/java/org/testing/Resources/DummyData.json");
		
		s = JsondataupdateusingorgJson.JsondataUpdate(s, "tool", "API2");
		
		s = JsondataupdateusingorgJson.JsondataUpdate(s, "Course", "Selenium3");
		
		System.out.println(s);
			
		
	}
	

}
