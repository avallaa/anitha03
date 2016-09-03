package com.ERP.master;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class baseng {

	static library Li=new library();
  @BeforeTest
  public void beforeTest() {
	  
	  Li.login("admin", "master");
	  
  }   

  @AfterTest
  public void afterTest() {
	 Li.logout();
	  
	  
  }

  @BeforeSuite
  public void beforeSuite() throws IOException {
	  Li.appopen("http://webapp.qedgetech.com");
	  
	  
  }

  @AfterSuite
  public void afterSuite() {
	  
	  Li.appclose();
	  
  }

  
  
}
