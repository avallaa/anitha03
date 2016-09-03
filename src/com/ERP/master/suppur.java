package com.ERP.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Supplier;

public class suppur {



	
		@FindBy(xpath=".//*[@id='mi_a_suppliers']/a")
		WebElement suppli;
		
		
		@FindBy(xpath=".//*[@id='mi_a_purchases']/a")
		WebElement purch;
		
		
		public void sup()
		{
			suppli.click();
		}
		
		public void pur()
		{
			purch.click();
		}
		
		
		
		
}

