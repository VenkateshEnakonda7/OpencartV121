package com.opencart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Basepage {
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement accountMessage;
	
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logout;
	
	
	public Boolean isAccountDisplayed() {
		try {
		return (accountMessage.isDisplayed());
		}catch(Exception e) {
			return false;
		}
	}
	
	public MyAccountPage clickOnLogout() {
		logout.click();
		return this;
	}

}
