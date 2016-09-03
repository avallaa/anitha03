package com.ERP.testscripts;

import java.awt.Desktop.Action;
import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Basicscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//app open
		ProfilesIni pi=new ProfilesIni();
		FirefoxProfile fi=pi.getProfile("anitha");
		
	WebDriver driver=new FirefoxDriver(fi);
	String exp="Login";
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	String actual=driver.findElement(By.id("btnsubmit")).getText();
	if(exp.equalsIgnoreCase(actual)) {
		System.out.println("app open");
	}else{
		System.out.println("app not open");
	}
	
	//To reset
	driver.findElement(By.id("btnreset")).click();
	exp ="Reset";
	actual=driver.findElement(By.id("btnreset")).getText();
	if (exp.equalsIgnoreCase(actual))
	{
		System.out.println("Reset is successfull");
		
	}else{
		System.out.println("Reset not succeswsfull");
	}
	
	//Passing usernamd and password values
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("master");
	driver.findElement(By.id("btnsubmit")).click();
	
	}}
	// Stock accounting screen
	/*exp="Stock Accounting System";	
	actual=driver.findElement(By.xpath(".//*[@id='ewHeaderRow']/div[2]/div/strong/span")).getText();
	System.out.println(actual);
	if (exp.equalsIgnoreCase(actual.trim())) {
		System.out.println("Stock Accounting System main screen opened");
	}else {
		System.out.println("Stock Accounting System main screen not opened");
	}
	*/
	//mouse over on stock items
	/*Actions act= new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	
	
	//Stock category screen
	driver.findElement((By.xpath(".//*[@id='mi_a_stock_categories']/a"))).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	driver.findElement(By.id("x_Category_Name")).sendKeys("testaug18");
	driver.findElement(By.id("btnAction")).click();
	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[2]/div[2]/div/button")).click();
	driver.findElement(By.id("psearch")).sendKeys("testaug17");
	driver.findElement(By.id("btnsubmit")).click();	
	
	
	
	//UOM screen
	exp="Add succeeded";
	act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
	driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.id("x_UOM_ID")).sendKeys("5656566666");
	driver.findElement(By.id("x_UOM_Description")).sendKeys("sampletest100551");
	driver.findElement(By.id("btnAction")).click();
    driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
    
    
   actual=driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[3]/div/div")).getText();	
   Sleeper.sleepTightInSeconds(3);

    
   if(exp.equalsIgnoreCase(actual)) {
		System.out.println("Uom successfull,");
		   driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
	
	}else{
		System.out.println("uom is not successfull");
	}*/
   
   //Supplier screen
 /*  
  driver.findElement(By.xpath(".//*[@id='mi_a_suppliers']/a")).click();
  driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
  driver.findElement(By.xpath(".//*[@id='x_Supplier_Name']")).sendKeys("uuuuuuuuuuu");
  driver.findElement(By.xpath(".//*[@id='x_Address']")).sendKeys("asdasda");
  driver.findElement(By.xpath(".//*[@id='x_City']")).sendKeys("sfsdfsd");
  driver.findElement(By.xpath(".//*[@id='x_Country']")).sendKeys("sdfsdfs");
  driver.findElement(By.xpath(".//*[@id='x_Contact_Person']")).sendKeys("eygerer");
  driver.findElement(By.xpath(".//*[@id='x_Phone_Number']")).sendKeys("4564564");
  driver.findElement(By.xpath(".//*[@id='x__Email']")).sendKeys("tgfrtgwrtgw");
  driver.findElement(By.xpath(".//*[@id='x_Mobile_Number']")).sendKeys("457457474");
  driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys("ghdghdfghdfgd");
  driver.findElement(By.id("btnAction")).click();
  Sleeper.sleepTightInSeconds(2);
  driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();*/
	//Purchases
/*	driver.findElement(By.xpath(".//*[@id='mi_a_purchases']/a")).click();
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
	}*/

 /*  Select sel=new Select(driver.findElement(By.xpath(".//*[@id='x_Supplier_ID']")));
   sel.selectByVisibleText("toyota");
	driver.findElement(By.id("x_Notes")).sendKeys("awdawqwq");
	driver.findElement(By.xpath(".//*[@id='x_Total_Amount']")).sendKeys("200");
	driver.findElement(By.xpath(".//*[@id='ewBreadcrumb3']")).click();
	driver.findElement(By.xpath(".//*[@id='x_Total_Payment']")).sendKeys("100");
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
	
	//Customers screen
	driver.findElement(By.xpath(".//*[@id='mi_a_customers']/a")).click();
	driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	driver.findElement(By.id("x_Customer_Name")).sendKeys("tttttt");
	driver.findElement(By.xpath(".//*[@id='x_Address']")).sendKeys("asdasdasd");
	driver.findElement(By.xpath(".//*[@id='x_City']")).sendKeys("asdasdasd");
	driver.findElement(By.xpath(".//*[@id='x_Country']")).sendKeys("asdasdas");
	driver.findElement(By.xpath(".//*[@id='x_Contact_Person']")).sendKeys("asdfasfdas");
	driver.findElement(By.xpath(".//*[@id='x_Phone_Number']")).sendKeys("93422452");
	driver.findElement(By.xpath(".//*[@id='x__Email']")).sendKeys("yyy@gmail.com");
	driver.findElement(By.id("x_Mobile_Number")).sendKeys("23423423");
	driver.findElement(By.xpath(".//*[@id='x_Notes']")).sendKeys("sadasdasa");
	driver.findElement(By.xpath(".//*[@id='btnAction']")).click();
	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")).click();
	Sleeper.sleepTightInSeconds(2);
	driver.findElement(By.xpath("html/body/div[.]/div[2]/div/div[4]/div[2]/button")).click();
		
   
	
   driver.findElement(By.xpath(".//*[@id='msLoginDialog']/div/div/div[1]/button")).click();

   driver.findElement(By.xpath(".//*[@id='logout']")).click();
	Sleeper.sleepTightInSeconds(2);
	WebElement el=driver.findElement(By.cssSelector(".ajs-button.btn.btn-primary"));
	if (el.isDisplayed()) {
		el.click();
		
	}
	

	
	}}
	
	
	

*/