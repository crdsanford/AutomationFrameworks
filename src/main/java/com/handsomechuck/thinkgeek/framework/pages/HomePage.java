package com.handsomechuck.thinkgeek.framework.pages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.stereotype.Service;


@Service
public class HomePage extends Page{
	
	Actions action = new Actions(driver);
	private WebElement loginLink;
	private WebElement emailDropBox;
	private WebElement passwordDropBox;
	private WebElement goButton;
	
	
	protected WebElement loginLink() {
		loginLink = waitForElementDisplayed(By.xpath(".//*[@id='topnav_account']/a"));
		return loginLink;
	}
	
	protected WebElement emailDropBox() {
		emailDropBox = waitForElementDisplayed(By.xpath(".//*[@id='loggingin']//*[@name='un']"));
		return emailDropBox;
	}
	
	protected WebElement passwordDropBox() {
		passwordDropBox = waitForElementDisplayed(By.xpath(".//*[@id='loggingin']//*[@name='pass']"));
		return passwordDropBox;
	}
	
	protected WebElement goButton() {
		goButton = waitForElementDisplayed(By.xpath(".//*[@id='loggingin']//*[@value='Go']"));
		return goButton;
	}
	
	public void showLoginPage(){
		loginLink().click();
	}
	
	public void mouseOverLogDrop() {
		action.moveToElement(loginLink).build().perform();
	}
	
	public void emailLogDrop(String email) {
		action.moveToElement(emailDropBox).build().perform();
		emailDropBox.sendKeys(email);
	}
	
	public void verifyTitle(String title) {
	    String titleText = driver.getTitle();
	    assertThat(titleText, is(equalTo(title)));
	}
	
	
/*	
	public void mouseOverLogDrop(String email, String password) {
		Actions action = new Actions(driver);
		loginLink = driver.findElement(By.xpath(".//*[@id='topnav_account']/a"));
		emailBox = driver.findElement(By.xpath(".//*[@id='loggingin']//*[@name='un']"));
		passwordBox = driver.findElement(By.xpath(".//*[@id='loggingin']//*[@name='pass']"));
		go = driver.findElement(By.xpath(".//*[@id='loggingin']//*[@value='Go']"));
				
		action.moveToElement(loginLink).moveToElement(emailBox).build().perform();
		emailBox.sendKeys("csbaritone@gmail.com");
		action.moveToElement(loginLink).moveToElement(passwordBox).build().perform();
		passwordBox.sendKeys("*Wizard1687*");
		action.moveToElement(loginLink).moveToElement(go).build().perform();
		go.click();
	}
	
	public void verifyUserName(String name) {
		
		WebElement userName = driver.findElement(By.xpath(".//*[@id='topnav_account']/a/span"));
		String text = userName.getText();
		
		assertThat(text, is(equalTo(name)));
	}                 

	public void verifyInterests() {
		//Verify interest names
		String[] intNameExpected = {"Star Wars","Star Trek","Doctor Who","Minecraft","Legend Of Zelda","Marvel","Game Of Thrones","DC Comics","GeekLabs"};
		
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='brands-color']/ul/li/a/span"));
		int count = list.size();
		
		String[] intNamesActual = new String[count]; {
			
		for(int i = 0; i < count; i++){
			WebElement item = list.get(i);
			String text = item.getText();
			intNamesActual[i] = text;
			System.out.println(text);
			}
		assertArrayEquals(intNameExpected, intNamesActual);
		}
	}
*/	
	
}
