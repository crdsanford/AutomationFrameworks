package com.handsomechuck.thinkgeek.framework.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@Service
public class LoginPage extends Page{
	
	
	private WebElement emailTextBox;
	private WebElement passwordTextBox;
	private WebElement loginButton;
	private WebElement errorMsg;
	private WebElement welcomeMsg;
	//private WebElement iAmNotARobotButton;
	
	
	
	protected WebElement emailTextBox() {
		emailTextBox = waitForElementDisplayed(By.xpath(".//*[@id='content']/div[2]/form/div[1]/div[2]/input"));
		return emailTextBox;
	}
	
	protected WebElement passwordTextBox() {
		passwordTextBox = waitForElementDisplayed(By.xpath(".//*[@id='content']/div[2]/form/div[2]/div[2]/input"));
		return passwordTextBox;
	}

	protected WebElement loginButton() {
		loginButton = waitForElementDisplayed(By.xpath(".//*[@id='content']/div[2]/form/div[3]/div[2]/input"));
		return loginButton;
	}
	
	protected WebElement errorMsgLabel() {
		errorMsg = waitForElementDisplayed(By.xpath(".//*[@id='content']/div[2]/form/p"));
		return errorMsg;
	}
	
	protected WebElement welcomeMsg() {
		welcomeMsg = waitForElementDisplayed(By.xpath(".//*[@id='topnav_account']/a/span"));
		return welcomeMsg;
	}
		
	public void enterEmail(String email) {
		emailTextBox().sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordTextBox().sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton().click();
	}
	
	public void normalLogin(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}
		
	public void verifyWelcomeMsg(String message) {
		String actual = welcomeMsg().getText();
		Assert.assertEquals("Welcome message does not match.", message, actual);
		
	}
	
	public void verifyErrorMsg(String msg) {
		String actual = errorMsgLabel().getText();
		Assert.assertEquals("Error message does not match.", msg, actual);
	}
	
	public void verifyTitle(String title) {
	    String titleText = driver.getTitle();
	    assertThat(titleText, is(equalTo(title)));
	}
}
//new feature as of 2/9/16
//I think I need to try robot here but not sure how to find coordinates for a given element
//@When("^user clicks I Am Not A Robot Button$")
//public void user_clicks_I_Am_Not_A_Robot_Button() throws Throwable {
//  iAmNotARobotButton = driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/*[@class='recaptcha-checkbox-checkmark']"));
//  iAmNotARobotButton.click();
//}
