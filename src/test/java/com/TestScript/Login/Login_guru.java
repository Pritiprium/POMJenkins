package com.TestScript.Login;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageOb_Login.Page_Home;
import com.PageOb_Login.page_login;
import com.tekarch.utility.TestBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_guru extends TestBase{
    
    WebDriver driver;

    page_login objLogin;

    Page_Home objHomePage;

    @BeforeTest

    public void setup(){
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://demo.guru99.com/V4/");
    			
    }

    /**

     * This test case will login in http://demo.guru99.com/V4/

     * Verify login page title as guru99 bank

     * Login to application

     * Verify the home page using Dashboard message

     */

    @Test(priority=1)

    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

    objLogin = new page_login(driver);

    //Verify login page title

    String loginPageTitle = objLogin.getLoginTitle();

    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

    //login to application

    objLogin.loginToGuru99("mgr123", "mgr!23");

    // go the next page

    objHomePage = new Page_Home(driver);

    //Verify home page

    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));

    }
//    @Test(priority=4)
//    public void quitbrw() {
//    	driver.quit();
//    }
    
}
