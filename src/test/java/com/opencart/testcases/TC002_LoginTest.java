package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageobjects.HomePage;
import com.opencart.pageobjects.LoginPage;
import com.opencart.pageobjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass{
	
	@Test(groups= {"Master","Sanity"})
	public void verify_login() {
		try {
			
		logger.info("******** User is on HomePage********");
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickOnLogin();
		logger.info("User navigated to login page");
		
		LoginPage lp = new LoginPage(driver);
		lp.provideEmailAddress(prop.getProperty("email"));
		lp.providePassword(prop.getProperty("password"));
		lp.clickOnLoginButton();
		logger.info("User navigated to DashBoard page");
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean validLogin = mp.isAccountDisplayed();
		
		if(validLogin == true) {
			Assert.assertTrue(true);
			logger.info("User Successfully logedin");
		}else {
			Assert.assertTrue(false);
			logger.debug("Test cased failed");
			logger.error("User unable to login or please check the Credientials");
		}
//		Assert.assertEquals(validLogin, true);
		}catch(Exception e) {
			Assert.fail();
		}
		
	}
	

}
