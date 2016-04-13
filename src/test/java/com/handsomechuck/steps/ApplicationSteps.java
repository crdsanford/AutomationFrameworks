package com.handsomechuck.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class ApplicationSteps extends StepsBase {
	
	@Given("^as a non validated user$")
	public void as_a_non_validated_user() throws Throwable {
		driver.manage().deleteAllCookies();
	}

	@When("^browse to the application$")
	public void browse_to_the_application() throws Throwable {
	    driver.navigate().to("http://www.thinkgeek.com/");
	}
	
}
