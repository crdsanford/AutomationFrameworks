package com.handsomechuck.steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class HomePageSteps extends StepsBase {
	
	@When("^user clicks Login Link$")
	public void user_clicks_Login_Link() throws Throwable {
	   thinkGeek.homePage().showLoginPage();
	}

	@Then("^ThinkGeek Home page should show with title \"([^\"]*)\"$")
	public void thinkgeek_Home_page_should_show_with_title(String title) throws Throwable {
	   thinkGeek.loginPage().verifyTitle(title);
	}
	
	
	@When("^user mouses over Login Link$")
	public void user_mouses_over_Login_Link() throws Throwable {
	    thinkGeek.homePage().mouseOverLogDrop();
	}

	@Then("^dropdown login input boxes should show$")
	public void dropdown_login_input_boxes_should_show() throws Throwable {
	    
	}

	@When("^user enters \"([^\"]*)\" in email input box$")
	public void user_enters_in_email_input_box(String arg1) throws Throwable {
	    
	}

	@When("^user enters \"([^\"]*)\" in password input box$")
	public void user_enters_in_password_input_box(String arg1) throws Throwable {
	    
	}

	@When("^user clicks Go Button$")
	public void user_clicks_Go_Button() throws Throwable {
	 
	}
	
}