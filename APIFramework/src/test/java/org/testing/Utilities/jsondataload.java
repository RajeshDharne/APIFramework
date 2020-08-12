package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class jsondataload 
{
	public static String jsonfileload(String path) throws FileNotFoundException // this method need the path of json data as a input
	{
		File f = new File(path);
		
		FileInputStream fr = new FileInputStream(f);
		
		JSONTokener js = new JSONTokener(fr);
		
		JSONObject j = new JSONObject(js);
		
		return j.toString();
	}
	
	
	

}
