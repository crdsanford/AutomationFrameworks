package com.handsomechuck.thinkgeek.framework;

//import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringContext {

	@Bean(destroyMethod="quit")
	public WebDriver getDriver() {
		
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver","/usr/local/chromedriver");
		driver = new ChromeDriver();
		
//		String browser = System.getProperty("browser");
//		
//		if(browser.contentEquals("ff")){
//			driver= new FirefoxDriver();
//		}
//		else if(browser.contentEquals("ch")){
//			System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
//			
//		}
//	        File chromeDriverFile = new File(System.getProperty("user.dir") +  "/usr/local/chromedriver");
//			if(chromeDriverFile.exists()){
//				System.setProperty("webdriver.chrome.driver","/usr/local/chromedriver");
//				System.out.println("Driver path: " + System.getProperty("webdriver.chrome.driver"));
//				driver = new ChromeDriver();
//			}
//			else
//			{
//				System.out.println("Driver file does not exist in " + chromeDriverFile.getAbsolutePath());
//			}
//		}
//		else if(browser.contentEquals("ie")){
//			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//			//capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
//			//capabilities.setJavascriptEnabled(true);
//			//capabilities.setBrowserName("internet explorer");
//			//capabilities.setCapability("requireWindowFocus",true);
//			//capabilities.setCapability("platform", "WIN8.0");
//			//capabilities.setCapability("version", "10");
//	
//			File driverFile = new File(System.getProperty("user.dir") +  "/src/main/resources/driver/32/IEDriverServer.exe");
//			if(driverFile.exists()){
//				System.setProperty("webdriver.ie.driver", driverFile.getAbsolutePath());
//				driver = new InternetExplorerDriver(capabilities);
//			}
//			else
//			{
//				System.out.println("Driver file does not exist in " + driverFile.getAbsolutePath());
//			}
//		}
//		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
		return driver;
		
	}
}

