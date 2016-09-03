package com.ERP.master;

import org.eclipse.jetty.util.security.Password;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PomLoginpage {

	
	@FindBy(id="username")
	WebElement Uname;
	
	@FindBy(id="password")
	WebElement Passwd;
	
	@FindBy (id="btnsubmit")
	WebElement Login;
	
	@FindBy (id="btnreset")
	WebElement reset;
	
	public void adminlogin (String Un,String Pwd)
	{
		reset.click();
		Uname.sendKeys(Un);
		Passwd.sendKeys(Pwd);
		Login.click();
	}
	
	
	
	
	
}
