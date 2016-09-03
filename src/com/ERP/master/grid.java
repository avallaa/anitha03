package com.ERP.master;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class grid 
{
DesiredCapabilities cap=null;
@Parameters("browser")
@Test
public void Gexe(@Optional String br) throws MalformedURLException

{
	if (br.equalsIgnoreCase("firefox"))
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);	
	}
	else if (br.equalsIgnoreCase("chrome"))
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
	}
	else if (br.equalsIgnoreCase("ie")) 
	{
		cap=new DesiredCapabilities();
		cap.setBrowserName("ie");
		cap.setPlatform(Platform.ANY);	
	}
	

	
RemoteWebDriver driver=new RemoteWebDriver(new URL("http://10.0.0.7:4444/wd/hub"), cap);
	driver.get("http://webapp.qedgetech.com");
	driver.manage().window().maximize();
	
	PomLoginpage LP=PageFactory.initElements(driver, PomLoginpage.class);
	LP.adminlogin("admin", "master");
	

}
}
