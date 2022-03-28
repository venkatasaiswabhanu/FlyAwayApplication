package com.flyaway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(css = "body > table > tbody > tr:nth-child(6) > td:nth-child(6) > a")
	private WebElement bookFlight;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Actions actions = new Actions(driver);
	}
	
	public void clickHome() {
		home.click();
	}
	
	public void clickBookFlight() {
		bookFlight.click();
	}

}
