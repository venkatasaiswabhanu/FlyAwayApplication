package com.flyaway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	@FindBy(xpath = "//input[contains(@name,'email_id')]")
	private WebElement emailaddr;
	
	@FindBy(xpath = "//input[contains(@name,'pwd')]")
	private WebElement password;
	
	@FindBy(xpath = "//input[contains(@name,'pwd2')]")
	private WebElement cnfpassword;
	
	@FindBy(xpath = "//input[contains(@name,'name')]")
	private WebElement name;
	
	@FindBy(xpath = "//input[contains(@name,'address')]")
	private WebElement address;
	
	@FindBy(xpath = "//input[contains(@name,'city')]")
	private WebElement city;
	
	//body > form > table > tbody > tr:nth-child(7) > td > button
	@FindBy(css = "body > form > table > tbody > tr:nth-child(7) > td > button")
	private WebElement signupBtn;
	
	@FindBy(css = "body > form > table > tbody > tr:nth-child(3) > td > button")
	private WebElement loginBtn;
	
	@FindBy(linkText = "Login to continue checking flights")
	private WebElement cnfmsg;
	         

	
	public SignUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Actions actions = new Actions(driver);
	}
	
	public void enteremail(String email) {
		emailaddr.sendKeys(email);
	}
	
	public void pwd(String Password) {
		password.sendKeys(Password);
	}
	
	public void pwd2(String Password) {
		cnfpassword.sendKeys(Password);
	}
	
	public void name(String Name) {
		name.sendKeys(Name);
	}
	
	public void address(String Address) {
		address.sendKeys(Address);
	}
	
	public void city(String City) {
		city.sendKeys(City);
	}
	
	public void clickSignUpbtn() {
		signupBtn.click();
	}
	public String getTxt() {
		String text = cnfmsg.getText();
		return text;
	}
	public void clickLogin() {
		loginBtn.click();
	}
	
}
