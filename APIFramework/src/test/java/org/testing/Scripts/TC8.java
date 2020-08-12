package org.testing.Scripts;

import org.testing.Utilities.Conversion;
import org.testng.annotations.Test;

public class TC8 
{
	@Test
	
	public static void main(String[] args) {
		
	
	String xmldata = "<firstname>Devjani</firstname>";
	
	String jsondata = Conversion.xmltojson(xmldata);
	
	System.out.println(jsondata);
	
	Conversion.jsonconversion(jsondata);
	
	

}
}