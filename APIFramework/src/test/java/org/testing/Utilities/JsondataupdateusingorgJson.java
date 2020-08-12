package org.testing.Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsondataupdateusingorgJson 

{
	
	public static String JsondataUpdate(String Data, String searchkey, String replacevalue)
	
	{
		
		JSONObject J = new JSONObject(Data);
		
		JSONArray jr =   J.getJSONArray("phoneNumbers");
		
		int l = jr.length();
		
		for (int i = 0; i <l; i++)
			
		{
			
		  JSONObject dataobject= jr.getJSONObject(i);
		  
		  dataobject.put(searchkey, replacevalue);
		  
		  
			
		}
		
		return J.toString();
		
		
	}

}
