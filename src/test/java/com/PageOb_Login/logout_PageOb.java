package com.PageOb_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tekarch.utility.Browser_utility;
import com.tekarch.utility.TestBase;

public class logout_PageOb extends PageOB{
	
	public logout_PageOb(WebDriver driver){
		super.PageOM(driver);
	} 
	
	@FindBy(xpath = "//span[@id='userNavLabel']")
	WebElement userdropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutBtn;
	
	
	public void doLogOut() {
		Browser_utility.waitforVisiblity(userdropdown);
		userdropdown.click();
		Browser_utility.waitforVisiblity(logoutBtn);
		logoutBtn.click();
	}
	

}
