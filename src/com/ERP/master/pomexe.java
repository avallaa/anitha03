package com.ERP.master;

import javax.lang.model.element.PackageElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.google.common.base.Supplier;

public class pomexe {
	
	@Test
	public void loginexe()
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		
		PomLoginpage LP=PageFactory.initElements(driver, PomLoginpage.class);
		LP.adminlogin("admin", "master");
		/*suppur SP=PageFactory.initElements(driver, suppur.class);
		SP.sup();
		SP.pur();
		*/
		suppli SU=PageFactory.initElements(driver, suppli.class);
		SU.supcreation("anitha", "ameerpet", "hyderabad", "india", "sunitha", "234234", "rrr@yahoo.com", "4564563565", "wfrqefrqerdqwefrqefrqs");
		
		
		
		
	
			
			
			
			
		}
	
				
	}


