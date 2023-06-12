package Webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenUtilities.SeleniumUtility;

public class VtigerServicesPage extends SeleniumUtility {
	WebDriver driver;
	public VtigerServicesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Services_listView_basicAction_LBL_ADD_RECORD")
	private WebElement clickOnAddNewServicesButton;
	
	@FindBy(id="Services_editView_fieldName_servicename")
	private WebElement serviceNameInputField;
	
	@FindBy(id="Services_editView_fieldName_website")
	private WebElement websiteInputField;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement saveButtonOption;
	
	@FindBy(xpath="//h4[text()=' Services ']")
	private WebElement ServicesHeaderLink;
	
	@FindBy(className="listViewEntriesMainCheckBox")
	private WebElement selectAllServiceCheckBox;
	
	@FindBy(xpath="//button/i[@class=\"fa fa-trash\"]")
	private WebElement clickOnDeleteLogoButton;
	
	@FindBy(xpath="//button[contains(text(),'Yes')]")
	private WebElement clickYesOnCOnfimationPopup;
	
	@FindBy(xpath="//tr[@class='listViewEntries']")
	private WebElement clickOnServicesCreated;
	
	@FindBy (xpath="//table[@id='listview-table']/tbody/tr")
	private List <WebElement> allservicescreated;
	
	public WebElement clickOnAddNewServiceButton() {
		return clickOnAddNewServicesButton;
	}
	public boolean checkServicesCreation() {
		return isElementExist(clickOnServicesCreated);
	}
	
		public WebElement clickOnServicesHeaderLink() {
			waitForElementDisplayed(ServicesHeaderLink);
		return ServicesHeaderLink;
	}
	
	public WebElement selectAllServicesCheckBox() {
		return selectAllServiceCheckBox;
	}
	public WebElement selectDeleteLogo() {
		return clickOnDeleteLogoButton;
	}
	
	public WebElement clickYesOnCOnfirmationPopup() {
		return clickYesOnCOnfimationPopup;
	}
	
	public void addNewService(String CName, String website) {

		typeInput(serviceNameInputField, CName);
		typeInput(websiteInputField, website);
		clickOnElement(saveButtonOption);	
		
	}
	public boolean checkServicesCreated() {
		if ( 
			allservicescreated.isEmpty()
		) return true;
		return false;
		
	}
}
