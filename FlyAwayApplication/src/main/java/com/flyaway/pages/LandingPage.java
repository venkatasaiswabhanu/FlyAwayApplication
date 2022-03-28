package com.flyaway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(linkText = "Login/Signup")
	private WebElement loginSignUp;
	
	@FindBy(linkText = "Not a member? Signup")
	private WebElement signUp;
	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginSignup() {
		loginSignUp.click();
	}
	
	public void clickSignUp() {
		signUp.click();
	}
}
