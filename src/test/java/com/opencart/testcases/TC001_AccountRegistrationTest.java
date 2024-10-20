package com.opencart.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageobjects.HomePage;
import com.opencart.pageobjects.RegisterPage;

public class TC001_AccountRegistrationTest extends BaseClass{
	
	
	@Test(groups= {"Master","Regression"})
	public void veryfy_account_registration() {
		try {
		HomePage homepg = new HomePage(driver);
		homepg.clickMyAccount();
		logger.info("Clicked on my account");
		homepg.clickOnRegister();
		logger.info("Clicked on registr button");
		RegisterPage rp = new RegisterPage(driver);
		String pwd = getRandomAlpha() + getRandomNumber();
		logger.info("Filled details for registeration");
		rp.enterFullName(getRandomAlpha());
		rp.enterLastName(getRandomAlpha());
		rp.enterEmail(getRandomAlpha()+"@gamil.com");
		rp.enterphoneNumber(getRandomNumber());
		rp.enterPassword(pwd);
		rp.enterConfirmPassword(pwd);
		rp.enablePolicyBtn();
		logger.info("Clicked on policy button");
		rp.clickOnContinue();
		logger.info("Clicked on Continue button");
		String confMessg =  rp.validConfirmMessage();
		if(confMessg.equals("Your Account Has Been Created!")) {
			Assert.assertTrue(true);
		}else {
			logger.error("Validation got failed");
			logger.debug("please check the validations");
			Assert.assertTrue(false);
				}
			}catch(Exception e) {
			
				Assert.fail();
		}
	}

}
