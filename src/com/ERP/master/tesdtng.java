package com.ERP.master;

import org.testng.Assert;
import org.testng.annotations.Test;


public class tesdtng {
	
	@Test (priority=2, enabled=false)
	public void xyz(){
		
		Assert.assertEquals("gmail","gmail");
		
	}
	@Test (priority=1)
public void abc(){
	
	Assert.assertEquals("yahoo","yahoo");
}
	@Test (priority=3)
	public void dfg()
	{
		Assert.assertEquals("hotmail","hotmail");
	}
	
	
}
