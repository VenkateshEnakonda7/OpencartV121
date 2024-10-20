package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;
	
	
	public LoginPage provideEmailAddress(String e) {
		email.sendKeys(e);
		return this;
	}
	
	public LoginPage providePassword(String pwd) {
		password.sendKeys(pwd);
		return this;
	}
	
	public LoginPage clickOnLoginButton() {
		loginBtn.click();
		return this;
	}

}
