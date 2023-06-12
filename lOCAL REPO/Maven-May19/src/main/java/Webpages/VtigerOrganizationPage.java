package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Webpages.VtigerHomePage;

import Webpages.VtigerLoginPage;
import mavenUtilities.SeleniumUtility;

public class VtigerOrganizationPage extends SeleniumUtility {
			WebDriver driver;
			public VtigerOrganizationPage(WebDriver driver) {
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
		
		@FindBy(id="Accounts_listView_basicAction_LBL_ADD_RECORD")
		private WebElement addNewOrganization;
		
		@FindBy(id="Accounts_editView_fieldName_accountname")
		private WebElement OrganizationNameInputField;
		
		@FindBy(id="Accounts_editView_fieldName_website")
		private WebElement OrganizationWebsiteInputField;
		
		@FindBy(id="Accounts_editView_fieldName_phone")
		private WebElement OrganizationMobileNumberFieldInput;
		
		@FindBy(xpath="//button[text()='Save']")
		private WebElement SaveOrganizationField;
		
		@FindBy(xpath="//h4[@class=\"module-title pull-left text-uppercase\"]")
		private WebElement clickOnOrganizationheader;
		
		@FindBy(xpath="//input[@class=\"listViewEntriesCheckBox\"]")
		private WebElement clickOnOrganizationCreated;
		
		@FindBy(xpath="//button/i[@class=\"fa fa-trash\"]")
		private WebElement clickOnDeleteButton;
		
		@FindBy(xpath="//button[text()='Yes']")
		private WebElement confirmDeletingContact;
		
		public void addNewOrganization(String fName, String lName, String number) {
			clickOnElement(addNewOrganization);
			typeInput(OrganizationNameInputField, fName);
			typeInput(OrganizationWebsiteInputField, lName);
			typeInput(OrganizationMobileNumberFieldInput, number);
			clickOnElement(SaveOrganizationField);	
			driver.navigate().refresh();
			clickOnElement(clickOnOrganizationheader);
		}
		
		public void deleteCreatedOrganization() {
		
			clickOnElement(clickOnOrganizationCreated);
			clickOnElement(clickOnDeleteButton);
			clickOnElement(confirmDeletingContact);
		}
		
		public boolean checkOrganizationCreation() {
			return isElementExist(clickOnOrganizationCreated);
		}
}
