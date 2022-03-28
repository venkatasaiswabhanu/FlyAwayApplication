package com.flyaway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentGatewayPage {
	@FindBy(linkText = "Click to complete booking")
	private WebElement cnfBooking;
	
	@FindBy(css = "body > h3")
	private WebElement cnftxt;
	
	public PaymentGatewayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Actions actions = new Actions(driver);
	}
	
	public void clickto() {
		cnfBooking.click();
	}
	public String getcnftxt() {
		String cnftext = cnftxt.getText();
		return cnftext;
	}

}
