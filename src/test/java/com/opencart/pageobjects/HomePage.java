package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Basepage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement lnkLogin;
	
	public HomePage clickMyAccount() {
		lnkMyAccount.click();
		return this;
	}
	
	public HomePage clickOnRegister() {
		lnkRegister.click();
		return this;
	}
	
	public HomePage clickOnLogin() {
		lnkLogin.click();
		return this;
	}

}
