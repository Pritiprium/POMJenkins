package com.tekarch.utility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.ListnerNReport.ExtenReport;

public class TestBase {

	public static WebDriver driver;
	public Browser_utility ob_browser = new Browser_utility();
	ExtenReport ob_Report = new ExtenReport();
	

	@BeforeTest
	public void launchbr() {
		ob_browser.launchbrwsr();
		
	} 

	@AfterTest
	public void quit() {
		ob_browser.quitbrwsr();
	}
}
