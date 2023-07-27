package testNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomClasses.LoginOrSignUpPage;
import pomClasses.SignUpPage;

public class TestNGClass {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser () {
		    System.out.println("Before Class");
		
			
			System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Selenium Software\\firefox\\geckodriver.exe" );
			WebDriver driver = new FirefoxDriver();

			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}

	
	@BeforeMethod
	public void goToSignUpPage () {

		System.out.println("Before Method");

		driver.get ("http://www.facebook.com/");
        LoginOrSignUpPage loginOrSignUpPage= new LoginOrSignUpPage(driver);
        loginOrSignUpPage.ClickOnCreateNewAcc();
		
	}
	
	@Test
	public void test () throws InterruptedException {
		System.out.println("Test");		

		

		SignUpPage signUpPage = new SignUpPage(driver);
		signUpPage.selectDay();
		signUpPage.selectMonth();
		
		
		
	}
	

	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass () {
		System.out.println("After+ Class");
	}
	
}
