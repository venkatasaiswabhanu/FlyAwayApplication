package com.flyaway.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SignUpFuctionalitySteps extends Driver{
	@Given("A user clicks on Login\\/SignUp link text in Landing page of flyaway application")
	public void a_user_clicks_on_login_sign_up_link_text_in_landing_page_of_flyaway_application() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		landingPage.clickLoginSignup();
		System.out.println("User Clicked on Login/Signup button");
	}

	@When("he clicks on Not a member? Signup button")
	public void he_clicks_on_not_a_member_signup_button() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		landingPage.clickSignUp();
		System.out.println("User clicked on Signup button");
	}

	@When("pass Email id as {string},Password as {string},Confirm Password as {string}, Name as {string}, adress as {string} and city as {string}")
	public void pass_email_id_as_password_as_confirm_password_as_name_as_adress_as_and_city_as(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		signUpPage.enteremail(string);
		signUpPage.pwd(string2);
		signUpPage.pwd2(string3);
		signUpPage.name(string4);
		signUpPage.address(string5);
		signUpPage.city(string6);
		System.out.println("User successfully entered mandatory");

	}

	@When("click on Sign Up button")
	public void click_on_sign_up_button() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		signUpPage.clickSignUpbtn();
		System.out.println("User Clicked on Signup Button");

	}

	@Then("He should be able to see {string} message")
	public void he_should_be_able_to_see_message(String string) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedErrMsg = "Login to continue checking flights";
		String actualErrMsg = signUpPage.getTxt();
		Assert.assertEquals(actualErrMsg, expectedErrMsg);
		System.out.println("User Successfully Sign up");
	}


}
