package org.testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfileload 
{
	public static Properties propertiesload (String path) throws IOException
	
	{
		File f = new File(path);
		
		FileInputStream fr = new FileInputStream(f);
		
		Properties pr = new Properties();
		
		pr.load(fr);
		
		return pr; // this method is returning the object of properties
		
	}
	
	

}
