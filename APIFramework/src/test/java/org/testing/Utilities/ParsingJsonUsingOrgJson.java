package org.testing.Utilities;

import org.json.JSONArray;

public class ParsingJsonUsingOrgJson 
{
	
	public static void JsonExtract(String responsedata, String searchvalue)
	{
		JSONArray j = new JSONArray(responsedata);
		
	int l =	j.length();
	
	for(int i = 0; i<l; i++)
	{
		
		try {
			
			String Values = j.getJSONObject(i).getString(searchvalue); 
			System.out.println(Values);
			
		} 
		
		catch (Exception e) 
		{
			System.out.println("Exception Came");
			// TODO: handle exception
		}
		
			
			
			
		
	}
	
	}

}
