package com.PageOb_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tekarch.utility.TestBase;

public class PageOB {
	
	public void PageOM(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@id='Login']")
	WebElement lgn;

	public void setcredential() throws Exception {
		
		username.sendKeys("priti.p@salesforce.com");
		password.sendKeys("test@123");
		lgn.click();
	} 
	

}
