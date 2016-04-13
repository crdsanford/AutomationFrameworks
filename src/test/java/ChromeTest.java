import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://cnn.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();

	}

}
