package com.TestScript.Login;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageOb_Login.logout_PageOb;
import com.tekarch.utility.Browser_utility;
import com.tekarch.utility.TestBase;

public class ScriptOfLogout extends TestBase{
	
	logout_PageOb objectLogout;
	
	@BeforeTest
	public void setup() {
		objectLogout = new logout_PageOb(TestBase.driver);
	}
	
	@Test
	public void login() { 
		try {
			objectLogout.setcredential();
		} 
		catch (Exception e) {
			System.out.println(e);
			System.out.println("login again for logout page");
			
			//e.printStackTrace();
		}
	} 
	
	@Test
	public void loginout() {
		System.out.println("logout from logout page");
		objectLogout.doLogOut(); 		
	}
	
	
	

}
