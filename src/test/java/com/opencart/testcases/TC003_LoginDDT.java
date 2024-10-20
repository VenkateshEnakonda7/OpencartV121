package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageobjects.HomePage;
import com.opencart.pageobjects.LoginPage;
import com.opencart.pageobjects.MyAccountPage;
import com.opencart.utilities.common.DataProviders;

public class TC003_LoginDDT extends BaseClass{
	
	@Test(dataProvider="LoginData", dataProviderClass=DataProviders.class,groups= {"DataDriven"})
	public void verify_login_ddt(String email, String password, String experted) {
		
		logger.info("******** User is on HomePage********");
		try {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickOnLogin();
		logger.info("User navigated to login page");
		
		LoginPage lp = new LoginPage(driver);
		lp.provideEmailAddress(email);
		lp.providePassword(password);
		lp.clickOnLoginButton();
		logger.info("User navigated to DashBoard page");
		
		MyAccountPage mp = new MyAccountPage(driver);
		boolean validLogin = mp.isAccountDisplayed();
		
		if(experted.equalsIgnoreCase("Valid")) {
			if(validLogin) {
				mp.clickOnLogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		if(experted.equalsIgnoreCase("Invalid")) {
			
			if(validLogin == true) {
				mp.clickOnLogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		}
		catch(Exception e) {
			Assert.fail();
		}
		
	}

}
