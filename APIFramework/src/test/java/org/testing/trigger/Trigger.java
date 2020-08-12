package org.testing.trigger;

import java.io.IOException;

import org.testing.Scripts.GetRequestTC2;
import org.testing.Scripts.PostRequest;
import org.testing.Scripts.idsTC3;

public class Trigger 
{
	public static void main(String[] args) throws IOException 
{
		
	
	PostRequest post = new PostRequest();
	
	post.TC1();
	
	GetRequestTC2 get = new GetRequestTC2();
	
	get.getrequestforidTC2();
	
	idsTC3 RD = new idsTC3();
	
	RD.TC3();
	
}

}
