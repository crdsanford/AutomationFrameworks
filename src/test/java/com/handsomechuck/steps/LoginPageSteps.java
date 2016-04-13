package com.handsomechuck.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPageSteps extends StepsBase {
	


	@Then("^Login Page should show with title \"([^\"]*)\"$")
	public void login_Page_should_show_with_title(String title) throws Throwable {
		thinkGeek.loginPage().verifyTitle(title);
	}

	@When("^user enters \"(.*?)\" as user name$")
	public void user_enters_as_user_name(String email) throws Throwable {
	    thinkGeek.loginPage().enterEmail(email);
	}
	
	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_valid_password(String password) throws Throwable {
	    thinkGeek.loginPage().enterPassword(password);
	}
    
	@When("^user clicks Login Button$")
	public void user_clicks_Login_Button() throws Throwable {
	    thinkGeek.loginPage().clickLoginButton(); 
	}

	@Then("^welcome message \"([^\"]*)\" should show$")
	public void welcome_message_should_show(String message) throws Throwable {
		thinkGeek.loginPage().verifyWelcomeMsg(message);
	}
	
	@Then("^invalid email or password message \"([^\"]*)\" should show$")
	public void invalid_email_or_password_message_should_show(String msg) throws Throwable {
	    thinkGeek.loginPage().verifyErrorMsg(msg);
	}

	
	
}

