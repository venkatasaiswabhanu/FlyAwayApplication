package com.flyaway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	@FindBy(xpath = "(//option[contains(@value,'2')])[1]")
	private WebElement source;
	
	@FindBy(xpath = "(//option[contains(@value,'1')])[2]")
	private WebElement destination;
	
	@FindBy(css = "body > form > table > tbody > tr > td:nth-child(3) > button")
	private WebElement submit;
	
	@FindBy(linkText = "Book Flight")
	private WebElement bookFlight;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Actions actions = new Actions(driver);
	}
	
	public void clickHome() {
		home.click();
	}
	
	public void clickSource() {
		source.click();
	}
	
	public void clickDestination() {
		destination.click();
	}
	public void clickSubmit() {
		submit.click();
	}
	public void clickBookFlight() {
		bookFlight.click();
	}

}
