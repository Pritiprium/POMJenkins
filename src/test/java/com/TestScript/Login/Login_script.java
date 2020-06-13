package com.TestScript.Login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageOb_Login.Login_PageOM;
import com.tekarch.utility.Browser_utility;
import com.tekarch.utility.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_script extends TestBase {

	//WebDriver driver;
	Login_PageOM obOfLogin;

	/*@BeforeSuite
	public void launchbrwsr() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		obOfLogin = new Login_PageOM(driver);		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	*/

	@BeforeTest
	public void setup() {
		obOfLogin = new Login_PageOM(TestBase.driver);
		
	}

	@Test(priority = 1)
	public void validcred() throws Exception {			
		obOfLogin.setcredential();	
		System.out.println("login in login script");
	}
//	@Test(priority = 2)
//	public void logout() {
//		
//	} 
	
	@Test(priority = 3, enabled = false)
	public void invaidcredential() {
		TestBase.driver.get("https://login.salesforce.com/");
		
		obOfLogin.invalidcredential();
	}
	

}
