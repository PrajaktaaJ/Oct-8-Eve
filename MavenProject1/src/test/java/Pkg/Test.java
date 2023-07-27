package Pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Selenium Software\\firefox\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.get ("https://www.facebook.com/");
		
		
	}

}
