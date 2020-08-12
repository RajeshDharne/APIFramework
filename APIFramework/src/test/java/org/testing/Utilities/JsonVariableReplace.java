package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonVariableReplace 
{
	public static String jsonvaluetovariable(String jsondata, String variablename, String replacevale)
	{
		String retrundata = jsondata.replaceAll(Pattern.quote("{{" +variablename+"}}"), replacevale );
		
		return retrundata;
		
	}

}
