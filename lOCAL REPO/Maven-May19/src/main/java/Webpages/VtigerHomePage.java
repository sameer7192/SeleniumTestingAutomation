package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenUtilities.SeleniumUtility;


public class VtigerHomePage extends SeleniumUtility{
	WebDriver driver;
	public VtigerHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#appnavigator")
	private WebElement flowNavigator;
	
	@FindBy(xpath="//span[contains(text(),'MARKETING')]")
	private WebElement selectMarketingOption;
	
	@FindBy(xpath="//a[@title='Leads']")
	private WebElement selectLeadsOption;
	
	@FindBy(xpath="//a[@title='Contacts']")
	private WebElement selectContactsOption;
	
	@FindBy(xpath="//a[@title=\'Organizations\']")
	private WebElement selectOrganizationOption;
	
	@FindBy(xpath="//span[contains(text(),'SALES')]")
	private WebElement selectSalesOption;
	
	
	@FindBy(xpath="//span[contains(text(),' Services')]")
	private WebElement selectSalesServicesOption;
	
	public void navigateToLeadsPage() {
		clickOnElement(flowNavigator);
		clickOnElement(selectMarketingOption);
		clickOnElement(selectLeadsOption);
	}
	
	public void navigateToContactsPage() {
		clickOnElement(flowNavigator);
		clickOnElement(selectMarketingOption);
		clickOnElement(selectContactsOption);
	}
	
	public void navigateToOrganizationPage() {
		clickOnElement(flowNavigator);
		clickOnElement(selectMarketingOption);
		clickOnElement(selectOrganizationOption);
	}
	public WebElement getFlowNavigator() {
		return flowNavigator;
	}
	public WebElement goToMarketingOption() {
		return selectMarketingOption;
	}
	
	public WebElement goToContactOption() {
		return selectContactsOption;
	}
	public void navigateToServicesPage() {
		clickOnElement(getFlowNavigator());
		clickOnElement(selectSalesOption);
		clickOnElement(selectSalesServicesOption);
}
	public WebElement goToSalesOption() {
		return selectSalesOption;
	}
	
	public WebElement goToSalesServicesOption() {
		return selectSalesServicesOption;
	}
	
	
}
