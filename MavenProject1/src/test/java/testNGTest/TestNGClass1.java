package testNGTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGClass1 {
	SoftAssert soft;
	@BeforeClass
	public void beforeClass () {
		    System.out.println("Before Class");
	}
	
	
	@BeforeMethod
	public void beforeMethod () {
            System.out.println("Before Method");
            
    		SoftAssert soft = new SoftAssert();

	}
	
	@Test
	public void test1() {
		System.out.println("Test1- Class1");
		
		String actualTitle="Facebook";
		String expectedTitle="Facebook";
		
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertAll();

		
	}
	
	@Test 
	public void test2() {
		System.out.println("Test2- Class1");
		
		
		String actualUrl="https://www.facebook.com/";
		String expectedUrl="https://www.facebook.com/";
		
		//SoftAssert soft = new SoftAssert();

		
		//soft.assertEquals(actualUrl, expectedUrl, "Url not found");
		//soft.assertNotEquals(actualUrl, expectedUrl, "Url not found");


		
		boolean result = actualUrl.equals(expectedUrl);
		
		soft.assertTrue(result);
		
	    //soft.assertFalse(result);
		
		soft.assertAll();
		

		
		
	}
	
	@Test
	public void test3() {
		System.out.println("Test3- Class1");
		

	}
	
	@Test
	public void test4() {
		System.out.println("Test4- Class1");
	}
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass () {
		System.out.println("After Class");
	}
	

}
