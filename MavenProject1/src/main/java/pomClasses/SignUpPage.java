package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	@FindBy (xpath= "//select[@id='day']")
	private WebElement dayOfBirth;
	
	@FindBy (xpath= "//select[@id='month']")
	private WebElement monthOfBirth;
	
	@FindBy (xpath= "(//a[text( )='Privacy Policy'])[2]")
	private WebElement privacyPolicy;
	
	private WebDriver driver;

	
	public SignUpPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	public void selectDay() {
		Select s= new Select(dayOfBirth);
		s.selectByValue("5");
	}
	
	public void selectMonth() {
		Select s= new Select(monthOfBirth);
		s.selectByValue("May");
	}
	
	public void Scroll() {
		JavascriptExecutor javaScriptExecutor= (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("arguments[0].scrollIntoView(true);", privacyPolicy);
		
	}
	
	
	public void ClickOnPrivacyPolicy() {
		Actions act = new Actions(driver);
		act.moveToElement(privacyPolicy).click().build().perform();
	}
	
	
	
	

}
