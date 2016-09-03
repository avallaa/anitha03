package com.ERP.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.Key;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.win32.Wdm.KEY_BASIC_INFORMATION;

public class library {

	public static Properties pr;
	public static FileInputStream fis;
	public static WebDriver driver;
	public static String exp,actual;
	public static Actions act;
	
	
	
	public String appopen(String url) throws IOException
	{
		pr=new Properties();
		fis=new FileInputStream("H:\\Anitha\\ERP\\src\\com\\ERP\\propertiees\\Rep.properties");
		pr.load(fis);
		
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fi=pi.getProfile("anitha");
		driver=new FirefoxDriver(fi);
		//App open
		exp="Login";
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		actual=driver.findElement(By.id("btnsubmit")).getText();
		if(exp.equalsIgnoreCase(actual)) {
			return("app open");
			//System.out.println("app open");
		}else{
			//System.out.println("app not open");
			return("app not open");
		}
		
	}
	
	
		//Reset and Login
		
		public String login(String un,String pwd){
		exp=pr.getProperty("exp");
		driver.findElement(By.id(pr.getProperty("reset"))).click();
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(un);
		driver.findElement(By.id(pr.getProperty("pwd"))).sendKeys(pwd);
		driver.findElement(By.id(pr.getProperty("submit"))).click();
		actual=driver.findElement(By.xpath(pr.getProperty("act"))).getText();
		if (exp.equalsIgnoreCase(actual.trim())) {
			return("Stock accounting main screen opened");
			//System.out.println("Stock Accounting System main screen opened");
		}else {
			return("Stock accounting main screen not opened");
			//System.out.println("Stock Accounting System main screen not opened");
		}
		}
		
		// Stock item
		
		public String stockitem(String catname,String search){
		exp="Add succeeded";
		act= new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		driver.findElement((By.xpath(".//*[@id='mi_a_stock_categories']/a"))).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.id(pr.getProperty("categoryname"))).sendKeys(catname);
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		//driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[2]/div/button")).click();
		
		 actual=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();
		//driver.findElement(By.id("psearch")).sendKeys(search);
		//driver.findElement(By.id("btnsubmit")).click();
	   
	   // System.out.println(actual);
	    if (exp.equalsIgnoreCase(actual)){
	    	return("Stock category added");
	    	
	    }else{
	    	return("Stock category not added");
	    }
		}
		
		//UOM Screen
	    
	    public String uom(String id,String des){
	    exp="Add succeeded";
	    
	    act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id(pr.getProperty("UOMID"))).sendKeys(id);
		driver.findElement(By.id(pr.getProperty("UOMDesc"))).sendKeys(des);
		driver.findElement(By.id("btnAction")).click();
	    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	    Sleeper.sleepTightInSeconds(2);
	    driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[4]/div[2]/button")).click();
	    
	    
	    
	   actual=driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[3]/div/div")).getText();	
	   Sleeper.sleepTightInSeconds(3);

	    
	   if(exp.equalsIgnoreCase(actual.trim())) {
			//System.out.println("Uom successfull,");
		   return "uom successfull";
			  // driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		
		}else{
			return "uom not successfull";
			//System.out.println("uom is not successfull");
		
		}}
	   
	   //Supplier
	   
	   public String supplier(String sname,String address,String city,String country,String cper,String pno,String email,String mno,String notes){
		   exp=pr.getProperty("Suppexp");
	   driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
	   driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	   driver.findElement(By.xpath(pr.getProperty("Suppname"))).sendKeys(sname);
	   driver.findElement(By.xpath(pr.getProperty("Suppaddress"))).sendKeys(address);
	   driver.findElement(By.xpath(pr.getProperty("Suppcity"))).sendKeys(city);
	   driver.findElement(By.xpath(pr.getProperty("Suppcountry"))).sendKeys(country);
	   driver.findElement(By.xpath(pr.getProperty("SuppConper"))).sendKeys(cper);
	   driver.findElement(By.xpath(pr.getProperty("Supppno"))).sendKeys(pno);
	   driver.findElement(By.xpath(pr.getProperty("Suppemail"))).sendKeys(email);
	   driver.findElement(By.xpath(pr.getProperty("Suppmno"))).sendKeys(mno);
	   driver.findElement(By.xpath(pr.getProperty("Suppnotes"))).sendKeys(notes);
	   driver.findElement(By.id("btnAction")).click();
	   Sleeper.sleepTightInSeconds(2);
	   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	   Sleeper.sleepTight(2000);
	 	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
	 	actual=driver.findElement(By.xpath(pr.getProperty("Suppact"))).getText();
	 	if (exp.equalsIgnoreCase(actual)){
	 		return ("supplier added");
	 		}else{
	 			return("supplier not added");
	 		}}
	 	
	 	//purchase
	 	public String purshase(String amt,String paymt){
	 	exp=pr.getProperty("pexp");
	 	
	 	driver.findElement(By.xpath(".//*[@id='mi_a_purchases']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		
		Sleeper.sleepTight(2000);
		driver.findElement(By.xpath(".//*[@id='el_a_purchases_Purchase_Date']/div/span/button")).click();
		
		String emy="March, 2017";
		
		String amy=driver.findElement(By.xpath("html/body/div[17]/table/thead/tr[1]/td[2]")).getText();
		while (!emy.equalsIgnoreCase(amy)) {
			
			driver.findElement(By.xpath("html/body/div[17]/table/thead/tr[2]/td[4]/div")).click();
			amy=driver.findElement(By.xpath("html/body/div[17]/table/thead/tr[1]/td[2]")).getText();
		}
		String ed="18";
		
		
		java.util.List<WebElement> dates=driver.findElements(By.xpath("html/body/div[17]/table/tbody/tr/td"));
		for (int i = 0; i < dates.size(); i++) {
			String ad=dates.get(i).getText();
			if (ed.equalsIgnoreCase(ad) ){
				dates.get(i).click();
				break;
			}
		}

	   Select sel=new Select(driver.findElement(By.xpath(".//*[@id='x_Supplier_ID']")));
	   sel.selectByVisibleText("toyota");
		driver.findElement(By.id(pr.getProperty("pnotes"))).sendKeys("awdawqwq");
		driver.findElement(By.xpath(pr.getProperty("pamount"))).sendKeys(amt);
		driver.findElement(By.xpath(".//*[@id='ewBreadcrumb3']")).click();
		driver.findElement(By.xpath(pr.getProperty("totalamount"))).sendKeys(paymt);
		driver.findElement(By.xpath(".//*[@id='ewBreadcrumb3']")).click();
		//driver.findElement(By.xpath(".//*[@id='x_Total_Balance']")).click();
		//driver.findElement(By.xpath(".//*[@id='x_Total_Balance']")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("btnAction")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		actual=driver.findElement(By.xpath(pr.getProperty("pact"))).getText();
		if (exp.equalsIgnoreCase(actual)){
			return("Purchase added");			
		}else{
			return("Purchase not added");
		}
		}


		//customer
		
		public String customer (String cname,String address,String city,String country,String contper,String pno,String email,String mno,String notes){
			exp=pr.getProperty("cexp");
		
			driver.findElement(By.xpath(".//*[@id='mi_a_customers']/a")).click();
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			driver.findElement(By.id(pr.getProperty("cname"))).sendKeys(cname);
			driver.findElement(By.xpath(pr.getProperty("caddress"))).sendKeys(address);
			driver.findElement(By.xpath(pr.getProperty("ccity"))).sendKeys(city);
			driver.findElement(By.xpath(pr.getProperty("ccountry"))).sendKeys(country);
			driver.findElement(By.xpath(pr.getProperty("ccperson"))).sendKeys(contper);
			driver.findElement(By.xpath(pr.getProperty("cpno"))).sendKeys(pno);
			driver.findElement(By.xpath(pr.getProperty("cemail"))).sendKeys(email);
			driver.findElement(By.xpath(pr.getProperty("Suppmno"))).sendKeys(mno);
			driver.findElement(By.xpath(pr.getProperty("cnotes"))).sendKeys(notes);
			driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
			Sleeper.sleepTightInSeconds(2);
			driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
			actual=driver.findElement(By.xpath(pr.getProperty("cact"))).getTagName();
			if (exp.equalsIgnoreCase(actual)){
				return("customer added");
			}else{
				return("customer not added");
			}
		}
		
			public void  logout()
			{
			//exp="Are you sure you want to logout?";
			driver.findElement(By.xpath(".//*[@id='logout']")).click();
			Sleeper.sleepTightInSeconds(2);
			WebElement el=driver.findElement(By.cssSelector(".ajs-button.btn.btn-primary"));
			if (el.isDisplayed()) {
				el.click();
			}
				/*actual=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div")).getText();
				if (exp.equalsIgnoreCase(actual)){
					return "logout successfull";
							
				}else
				{
					return "logout not successfull";
				}
			}*/
			}
				
		
			public void appclose()
			{
			
				driver.close();
			}
			
			
			
			
	}
		

		












