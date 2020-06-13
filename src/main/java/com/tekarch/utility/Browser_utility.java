package com.tekarch.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_utility {
	
	
	public  void launchbrwsr() {
		WebDriverManager.chromedriver().setup();		
		TestBase.driver = new ChromeDriver();
		TestBase.driver.get("https://login.salesforce.com/");
		TestBase.driver.manage().window().maximize();
	}
	public static void waitforVisiblity(WebElement elefowait) {
	WebDriverWait wait = new WebDriverWait(TestBase.driver, 30);
	wait.until(ExpectedConditions.visibilityOf(elefowait));
		
	}
	public static void quitbrwsr() {
		TestBase.driver.quit();
	}

}
