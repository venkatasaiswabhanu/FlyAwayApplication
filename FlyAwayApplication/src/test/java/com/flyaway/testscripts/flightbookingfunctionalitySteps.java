package com.flyaway.testscripts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class flightbookingfunctionalitySteps extends Driver {
	
	
	@Given("A user click on Login\\/SignUp link text in Landing page of flyaway application")
	public void a_user_click_on_login_sign_up_link_text_in_landing_page_of_flyaway_application() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		landingPage.clickLoginSignup();
		System.out.println("User Clicked on Login/Signup button");
		
	}

	@When("he pass email as {string} and Password as {string}")
	public void he_pass_email_as_and_password_as(String string, String string2) {
		signUpPage.enteremail(string);
		signUpPage.pwd(string2);
		System.out.println("User entered mail id and Password");
	}

	@When("click on login button he will be successfully navigated to Dashboard page")
	public void click_on_login_button_he_will_be_successfully_navigated_to_dashboard_page() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		signUpPage.clickLogin();
		System.out.println("User clicked on Login button ");
		System.out.println("User successfully Logged into Flyaway application");
	}

	@When("he click on Home")
	public void he_click_on_home() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		homePage.clickHome();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.clickSource();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.clickDestination();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homePage.clickSubmit();
		System.out.println("User is on Home page selected source as Hyderabad and destination as Bangalore");
		
	}

	@When("click on first available flight he will navigate to confirmation page")
	public void click_on_first_available_flight_he_will_navigate_to_confirmation_page() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		homePage.clickBookFlight();
		System.out.println("User successfully entered Source and destination and booked first available flight");
	 
	}

	@When("if he click on Click to complete booking")
	public void if_he_click_on_click_to_complete_booking() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		paymentGatewayPage.clickto();
		System.out.println("User is on Payment Gateway Page");
	}

	@Then("he should be able to see {string} message")
	public void he_should_be_able_to_see_message(String string) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expTxt = string;
		String ActTxt = paymentGatewayPage.getcnftxt();
		System.out.println("User successfully booked flight Ticket");
		
	}

}
