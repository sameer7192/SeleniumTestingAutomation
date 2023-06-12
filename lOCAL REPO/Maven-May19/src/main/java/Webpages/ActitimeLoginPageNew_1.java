package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenUtilities.SeleniumUtility;

public class ActitimeLoginPageNew_1 extends SeleniumUtility{
	WebDriver driver;
	public ActitimeLoginPageNew_1 (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(name="pwd")
	private WebElement Password;
	
	@FindBy(id="loginButton")
	private WebElement LoginButton;
	
	public void LoginActitime (String username, String password) {
		typeInput(Username, username);
		typeInput(Password, password);
		clickOnElement(LoginButton);
	}
	
	
}
