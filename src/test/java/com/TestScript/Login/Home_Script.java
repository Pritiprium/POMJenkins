 package com.TestScript.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageOb_Login.Home_PageOb;
import com.PageOb_Login.Login_PageOM;
import com.tekarch.utility.TestBase;

public class Home_Script extends TestBase{
	
	Home_PageOb objectHome;
	//Login_PageOM objectLogin = new Login_PageOM(driver);
		
	
	@BeforeTest
	public void setup() {
		objectHome = new Home_PageOb(TestBase.driver);
		
	}
	
	@Test(priority = 1)
	public void setCredentials() throws Exception {
		objectHome.setcredential();
		
	}
	@Test(priority = 3)
	public void homepage() throws Exception {
		
		objectHome.homepage();
		
	}
	
	

}
