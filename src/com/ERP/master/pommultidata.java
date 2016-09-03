package com.ERP.master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class pommultidata {
	WebDriver driver;
	
	@BeforeTest()
	public void gg()
	{

		 driver= new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		PomLoginpage LP=PageFactory.initElements(driver, PomLoginpage.class);
		LP.adminlogin("admin", "master");
		
		
		
		
		
		
	}

	@Test(dataProvider="supp")
	
	public void multillogin(String sname,String saddress,String scity,String scountry,String sperson,String sphone,String semail,String smobile,
			String snotes)
	{
		
		
		suppli SU=PageFactory.initElements(driver, suppli.class);
		SU.supcreation(sname, saddress, scity, scountry, sperson, sphone, semail, smobile, snotes);
		

		}
	@Test(dataProvider="cat")
	
	public void pomactions(WebDriver dr,String catname,String uomid,String uomdesc)
	{
		
		pomactions ST=PageFactory.initElements(driver, pomactions.class);
		ST.cat(dr, catname, uomid, uomdesc);
		
	}
	@DataProvider
	public Object[][] cat(){
		
		Object[][] obt=new Object[3][4];
		
		obt[0][0]=driver;
		obt[0][1]="cat1";
		obt[0][2]="uid12";
		obt[0][3]="udesc123";

		obt[1][0]=driver;
		obt[1][1]="cat2";
		obt[1][2]="uid123";
		obt[1][3]="udesc1237";

		obt[2][0]=driver;
		obt[2][1]="cat3";
		obt[2][2]="uid1234";
		obt[2][3]="udesc123678";
		
		return obt;
		
	}
	{
		
		
		
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
	
	
	
	
	
	
	


