package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
	
	public static WebDriver openFirefoxBrowser() {
		
		    System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Selenium Software\\firefox\\geckodriver.exe" );
			WebDriver driver = new FirefoxDriver();
			return driver;
	}
		

	public static WebDriver openChromeBrowser() {
		
		    System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Selenium Software\\firefox\\geckodriver.exe" );
			WebDriver driver = new ChromeDriver();
			return driver;
	}
	
}
	


