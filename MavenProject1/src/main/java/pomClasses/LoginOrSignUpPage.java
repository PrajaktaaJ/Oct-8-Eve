package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {
	
	@FindBy (xpath= "//a[ text( )= 'Terms']")
	private WebElement terms;
	
	@FindBy (xpath = "//a[ text( )= 'Cookies']")
	private WebElement cookies;
	
	@FindBy (xpath= "//a[text( )= 'Create new account']")
	private WebElement createNewAccount;

	private WebDriver driver;
	
	
	public LoginOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	public void ClickOnTerms() {
		Actions act = new Actions(driver);
		act.moveToElement(terms).click().build().perform();
	}
	
	public void ClickOnCookies() {
		Actions act = new Actions(driver);
		act.moveToElement(cookies).click().build().perform();
	}
	
	public void ClickOnCreateNewAcc() {
		Actions act = new Actions(driver);
		act.moveToElement(createNewAccount).click().build().perform();
	}

	
}
