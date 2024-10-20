package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Basepage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtPhoneNumber;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath = "//label[@class='form-check-label']")
	WebElement textView;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkPolicy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	public RegisterPage enterFullName(String name) {
		txtFirstName.sendKeys(name);
		return this;
	}
	
	public RegisterPage enterLastName(String lstName) {
		txtLastName.sendKeys(lstName);
		return this;
	}
	
	public RegisterPage enterEmail(String mail) {
		txtEmail.sendKeys(mail);
		return this;
	}
	
	public RegisterPage enterphoneNumber(String moblienumber) {
		txtPhoneNumber.sendKeys(moblienumber);
		return this;
	}
	public RegisterPage enterPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		return this;
	}
	
	public RegisterPage enterConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);
		return this;
	}
	
	public RegisterPage enablePolicyBtn() {
		chkPolicy.click();
		return this;
	}
	
	public RegisterPage clickOnContinue() {
		btnContinue.click();
		return this;
	}
	
	public String validConfirmMessage() {
		try {
			return (msgConfirmation.getText());
		}catch (Exception e){
			return (e.getMessage());
		}
	}
}
