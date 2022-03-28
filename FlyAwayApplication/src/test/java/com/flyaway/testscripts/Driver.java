package com.flyaway.testscripts;

import java.net.MalformedURLException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.flyaway.pages.HomePage;
import com.flyaway.pages.LandingPage;
import com.flyaway.pages.PaymentGatewayPage;
import com.flyaway.pages.SignUpPage;

public class Driver extends Tools {
	protected static LandingPage landingPage;
	protected static SignUpPage signUpPage;
	protected static HomePage homePage;
	protected static PaymentGatewayPage paymentGatewayPage;
	
	public static void init() throws MalformedURLException {
		driver = new ChromeDriver();
		landingPage = new LandingPage(driver);
		signUpPage = new SignUpPage(driver);
		homePage = new HomePage(driver);
		paymentGatewayPage = new PaymentGatewayPage(driver);
	}

}
