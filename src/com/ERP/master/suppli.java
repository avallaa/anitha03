package com.ERP.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class suppli {
	
	@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
	WebElement suppli;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement supadd;
	@FindBy(xpath=".//*[@id='x_Supplier_Name']")
	WebElement supname;
	@FindBy(xpath=".//*[@id='x_Address']")
	WebElement supaddress;
	@FindBy(xpath=".//*[@id='x_City']")
	WebElement supcity;
	@FindBy(xpath=".//*[@id='x_Country']")
	WebElement supcountry;
	@FindBy(xpath=".//*[@id='x_Contact_Person']")
	WebElement supperson;
	@FindBy(xpath=".//*[@id='x_Phone_Number']")
	WebElement supphone;
	@FindBy(xpath=".//*[@id='x__Email']")
	WebElement supemail;
	@FindBy(xpath=".//*[@id='x_Mobile_Number']")
	WebElement supmobile;
	@FindBy(xpath=".//*[@id='x_Notes']")
	WebElement supnotes;
	@FindBy(xpath=".//*[@id='btnAction']")
	WebElement supsubmit;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement supclickadd;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
    WebElement supclickaddalert;
	public void supcreation(String sname,String saddress,String scity,String scountry,String sperson,String sphone,String semail,String smobile,
			String snotes)
	{
		suppli.click();
Sleeper.sleepTightInSeconds(2);
		supadd.click();
		Sleeper.sleepTightInSeconds(2);
		supname.sendKeys(sname);
		supaddress.sendKeys(saddress);
		supcity.sendKeys(scity);
		supcountry.sendKeys(scountry);
		supperson.sendKeys(sperson);
		supphone.sendKeys(sphone);
		supemail.sendKeys(semail);
		supmobile.sendKeys(smobile);
		supnotes.sendKeys(snotes);
		supsubmit.click();
		Sleeper.sleepTightInSeconds(2);
		supclickadd.click();
		Sleeper.sleepTightInSeconds(2);
		supclickaddalert.click();
		
			
	}
	

}
