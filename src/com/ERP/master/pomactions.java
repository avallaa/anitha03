package com.ERP.master;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

import com.google.common.collect.ImmutableBiMap.Builder;

public class pomactions {
	

	@FindBy(xpath=".//*[@id='mi_a_stock_items']/a")
	 WebElement stockitm;
	@FindBy(xpath=".//*[@id='mi_a_stock_categories']/a")
	WebElement stockcat;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement stockadd;
	@FindBy(xpath=".//*[@id='x_Category_Name']")
	WebElement stockcatname;
	@FindBy(xpath=".//*[@id='btnAction']")
	WebElement stockaddbutt;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement stockclickok;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement stockclickaddfin;
	
	@FindBy(xpath=".//*[@id='mi_a_unit_of_measurement']/a")
	WebElement uom;
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement uomadd;
	@FindBy(xpath=".//*[@id='x_UOM_ID']")
	WebElement uomid;
	@FindBy(xpath=".//*[@id='x_UOM_Description']")
	WebElement uomdesc;
	@FindBy(xpath=".//*[@id='btnAction']")
	WebElement uomclickadd;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement uomclickok;
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement uomalertok;
	
	
	
	
	public void cat(WebDriver driver,String cat,String uomidno,String uomdescname){
		Actions act=new Actions(driver);
		
		act.moveToElement(stockitm).build().perform();
		stockcat.click();
		stockadd.click();
		stockcatname.sendKeys(cat);
		stockaddbutt.click();
		Sleeper.sleepTightInSeconds(2);
		stockclickok.click();
		Sleeper.sleepTightInSeconds(2);
		stockclickaddfin.click();
		Sleeper.sleepTightInSeconds(2);
		act.moveToElement(stockitm).build().perform();
		uom.click();
		uomadd.click();
		uomid.sendKeys(uomidno);
		uomdesc.sendKeys(uomdescname);
		uomclickadd.click();
		Sleeper.sleepTightInSeconds(2);
		uomclickok.click();
		Sleeper.sleepTightInSeconds(2);
		uomalertok.click();
		
		
		
		
		
		

		

				
	}

}

