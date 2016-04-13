//package com.handsomechuck.steps;
//
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import com.handsomechuck.thinkgeek.framework.pages.Application;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
////import junit.framework.Assert;
////import org.hamcrest.MatcherAssert.assertThat;
//
//
//public class ThinkGeekLoginSteps {
//	
//	protected WebDriver driver;
//	protected Application thinkGeek;
//	@Before
//	public Application beforeClass(){
//		
//		System.setProperty("webdriver.chrome.driver","/usr/local/chromedriver");
//		driver = new ChromeDriver();
//		//driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//		
//		return thinkGeek = new Application();
//		
//		
//	}
//
//@Given("^as a non validated user$")
//public void as_a_non_validated_user() throws Throwable {
//	driver.manage().deleteAllCookies();
//}
//
//@When("^browse to the application$")
//public void browse_to_the_application() throws Throwable {
//    driver.navigate().to("http://www.thinkgeek.com/");
//}
//
//@Then("^ThinkGeek Home page should show$")
//public void thinkgeek_Home_page_should_show() throws Throwable {
//	thinkGeek.homePage().verifyTitle("ThinkGeek | Join In. Geek Out.");
//}
//
//@When("^user clicks Login Link$")
//public void user_clicks_Login_Link() throws Throwable {
//   thinkGeek.homePage().showLoginPage();
//}
//
//@Then("^Login Page should show$")
//public void login_Page_should_show() throws Throwable {
//	
//}
//
//@When("^user enters \"(.*?)\" as user name$")
//public void user_enters_as_user_name(String email) throws Throwable {
//    thinkGeek.loginPage().enterEmail(email);
//}
//
//@When("^user enters \"(.*?)\" as password$")
//public void user_enters_as_password(String password) throws Throwable {
//    thinkGeek.loginPage().enterPassword(password);
//}
//
//@When("^user clicks Login Button$")
//public void user_clicks_Login_Button() throws Throwable {
//    thinkGeek.loginPage().clickLoginButton();
//}
//
//@Then("^welcome message should show with \"(.*?)\"$")
//public void welcome_message_should_show(String msg) throws Throwable {
//    thinkGeek.loginPage().verifyWelcomeMsg(msg);  
//}
//
//@Then("^invalid email or password message should show$")
//public void invalid_email_or_password_message_should_show() throws Throwable {
//    thinkGeek.loginPage().verifyErrorMsg("OOPS! You have supplied an invalid login. Please try again.");
//}
//
//	@After
//	public void afterClass(){
//		driver.close();
//		driver.quit();
//		thinkGeek = null;
//	}
//	
//}

