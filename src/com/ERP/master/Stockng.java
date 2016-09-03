package com.ERP.master;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Stockng extends baseng{

		
		@Test(dataProvider="Stock")
		public void Stock(String catname,String search)
		
		{
			Li.stockitem(catname, search);
		}
		@DataProvider
		public Object[][] Stock(){
	    	
		      Object[][] obj=new Object[2][2];
		    	obj[0][0]="rrrrrrr";
		    	obj[0][1]="rrrrrrr";
		    	
		    	obj[1][0]="ffffff";
		    	obj[1][1]="ffffff";
		    
		    	
		    	return obj;
		    	


	}

}
