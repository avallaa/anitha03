
package com.ERP.master;

import java.io.IOException;

public class Execute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		library li=new library();
		String Res=li.appopen("http://webapp.qedgetech.com");
		System.out.println(Res);
		Res=li.login("admin","master");
		System.out.println(Res);
				
		
	Res=li.stockitem("aug21new", "aug21new");
		System.out.println(Res);
   	  Res=li.uom("6666777", "uuuujjj");
		System.out.println(Res);
	Res=li.supplier("ani", "ameerpet", "hyd", "ind", "nitin", "344224234", "sss@gmail.com", "234321421", "notes");
		System.out.println(Res);
      Res=li.purshase("5000", "3000");
      System.out.println(Res);
       Res=li.customer("aSSDSAD", "ASDSADASD", "fffff", "sdfsdfs", "fsfsdsd", "dasfdsaf", "rrr@adsas.com", "23423423", "dafasfasdf");
       System.out.println(Res);
       /*Res=li.logout();
    System.out.println(Res);
    Res=li.appclose();
    System.out.println(Res);*/
    		   
   
	}

}
