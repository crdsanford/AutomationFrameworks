import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class RobotTest {

	protected static WebDriver driver;
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","/usr/local/chromedriver");
		driver = new ChromeDriver();
		
		
		Robot r = new Robot();
		
		
		driver.navigate().to("http://www.wikipedia.org");
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.mouseRelease(InputEvent.BUTTON2_MASK);
		
		
		
		
	}

}
