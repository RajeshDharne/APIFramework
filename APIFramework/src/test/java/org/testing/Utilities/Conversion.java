package org.testing.Utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion 

{
	
	public static String xmltojson(String xmldata)
	
	{
		
		JSONObject js = XML.toJSONObject(xmldata);
		
		return js.toString();
		
	}

	
	public static void jsonconversion(String Json_data)
	
	{
		
		JSONObject obj = new JSONObject(Json_data);
		
		String XMLdata = XML.toString(obj);
		
		System.out.println(XMLdata);
		
	}
}
