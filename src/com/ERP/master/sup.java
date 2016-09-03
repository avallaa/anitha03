package com.ERP.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class sup extends baseng{
	
	@Test(dataProvider="supp")
	public void su(String sname,String address,String city,String country,String cper,String pno,String email,String mno,String notes)
	
	
	
	
		{
		Li.supplier(sname, address, city, country, cper, pno, email, mno, notes);
		
	}

    @DataProvider
	public Object[][] supp(){
		
		Object[][] obj=new Object[2][9];
		obj[0][0]="test123";
		obj[0][1]="ameer";
		obj[0][2]="hydd";
		obj[0][3]="india";
		obj[0][4]="nitin";
		obj[0][5]="44545555";
		obj[0][6]="fff@gmail.com";
		obj[0][7]="345245252";
		obj[0][8]="qawdjaslkdaslkdlas";
		
		obj[1][0]="test234";
		obj[1][1]="beee";
		obj[1][2]="sec";
		obj[1][3]="india";
		obj[1][4]="kiran";
		obj[1][5]="777777";
		obj[1][6]="lll@gmail.com";
		obj[1][7]="45645645";
		obj[1][8]="drgssdfgsdfgsg";
		
		return obj;
		
		
		
		
		
	}
}




