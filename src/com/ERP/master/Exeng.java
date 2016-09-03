package com.ERP.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exeng extends baseng
{
	@Test(dataProvider="update")
	public void Uom(String id,String des)
	{
		Li.uom(id, des);
	}
	@DataProvider
    public Object[][] update(){
    	
      Object[][] obj=new Object[3][2];
    	obj[0][0]="333444";
    	obj[0][1]="tttttt";
    	
    	obj[1][0]="888999";
    	obj[1][1]="eeeeee";
    	
    	obj[2][0]="888999";
    	obj[2][1]="rrrytyyyy";
    	
    	return obj;
    	
    }
	

			
	
/*	@Test (priority=3)
	public void Stock()
	{
		Li.stockitem("aug251", "aug251");
	}
	
	@Test (priority=1)
	public void Supplier()
	{
		Li.supplier("anita", "sample", "hyderabad", "india","kiran", "9897867567", "ddd@gmail.com", "23452352", "this is supplier notes");
	}
     
	@Test (priority=4)
	public void purchase()
	{
		Li.purshase("5000", "2000");
	
	}
	
	@Test (priority=5)
	public void Customer()
	{ 
		
		Li.customer("nikhil", "ssssss", "aaaaaaaaaa", "bbbbbbbb", "sssssss", "5645656", "ttt@yahoo.com", "34543254", "custnotes");
	}
	*/
	
}
