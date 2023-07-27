package testNGTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.BrowserSetup;

public class TestNGClass2 extends BrowserSetup {
	
	WebDriver driver;
	
	@Parameters ("browser")
	@BeforeTest
		public void launchBrowser (String browserName){
			
			if (browserName.equals("Firefox"))
			{
				driver = openFirefoxBrowser();
			}
			
			if (browserName.equals("Chrome")) 
			{
				driver = openChromeBrowser();
			}
		}
	
	
		
	
	
	@BeforeClass
	public void beforeClass () {
		    System.out.println("Before Class");
	}
	
	
	@BeforeMethod
	public void beforeMethod () {
            System.out.println("Before Method");
	}
	
	@Test
	public void testA() {
		System.out.println("TestA- Class2");
	}
	
	@Test 
	public void testB() {
		System.out.println("TestB- Class2");
		
	}
	
	@Test
	public void testC() {
		System.out.println("TestC- Class2");
	}
	
	@Test
	public void testD() {
		System.out.println("TestD- Class2");
	}
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass () {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTlass () {
		System.out.println("After Tlass");
	}
	

}
