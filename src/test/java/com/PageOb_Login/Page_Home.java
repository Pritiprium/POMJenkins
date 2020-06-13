package com.PageOb_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tekarch.utility.TestBase;

public class Page_Home extends TestBase {
	 public Page_Home (WebDriver driver){

	        this.driver = driver;

	    }

	
	WebDriver driver;

    By homePageUserName = By.xpath("//table//tr[@class='heading3']");

    //Get the User name from Home Page

        public String getHomePageDashboardUserName(){

         return    driver.findElement(homePageUserName).getText();

        }

}
