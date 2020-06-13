package com.PageOb_Login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tekarch.utility.Browser_utility;
import com.tekarch.utility.TestBase;

public class Home_PageOb extends PageOB {

	
	public Home_PageOb(WebDriver driver) {
		super.PageOM(driver);
	}
	
	
	@FindBy(id = "home_Tab")
	WebElement home;
	
	
	public void homepage() throws Exception {
		Browser_utility.waitforVisiblity(home);
		
		
		String actual = home.getText();
		assertEquals(actual, "Home");
		System.out.println(home.getText());
		home.click();
		Thread.sleep(2000);
	} 

}
	
