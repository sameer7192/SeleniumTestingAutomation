package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenUtilities.SeleniumUtility;

public class VtigerContactPage extends SeleniumUtility {
		WebDriver driver;
		public VtigerContactPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="Contacts_listView_basicAction_LBL_ADD_RECORD")
		private WebElement addContact;
		
		@FindBy(id="Contacts_editView_fieldName_firstname")
		private WebElement firstNameInputFieldForContact;
		
		@FindBy(id="Contacts_editView_fieldName_lastname")
		private WebElement lastNameInputFieldForContact;
		
		@FindBy(id="Contacts_editView_fieldName_mobile")
		private WebElement mobileNumberInputFieldForContact;
		
		@FindBy(xpath="//button[text()='Save']")
		private WebElement saveContactNumber;
		
		@FindBy(xpath="//div/a[@title=\"Contacts\"]")
		private WebElement clickOnContactTitle;
		
		@FindBy(xpath="//div[@class=\"table-actions\"]/span/input[@type=\"checkbox\"]")
		private WebElement clickOnContactCreated;
		
		@FindBy(xpath="//button/i[@class=\"fa fa-trash\"]")
		private WebElement clickOnDeleteButton;
		
		@FindBy(xpath="//button[text()='Yes']")
		private WebElement confirmDeletingContact;
		
		@FindBy(css=".listViewEntriesMainCheckBox")
		private WebElement clickOnSelectAllContactCheckBox;
		
		public void addNewContact(String fName, String lName, String number) {
//			clickOnElement(addContact);
			typeInput(firstNameInputFieldForContact, fName);
			typeInput(lastNameInputFieldForContact, lName);
			typeInput(mobileNumberInputFieldForContact, number);
			clickOnElement(saveContactNumber);	
			
		}
		
		public void deleteContact() {
		
			clickOnElement(clickOnContactCreated);
			clickOnElement(clickOnDeleteButton);
			clickOnElement(confirmDeletingContact);
		}
		
		public boolean checkContactCreation() {
			return isElementExist(clickOnContactCreated);
		}
		public WebElement clickOnAddNewContactButton() {
		
			clickOnElement(addContact);
			return addContact;
		}
		public WebElement clickOnContactHeaderLink() {
			clickOnElement(clickOnContactTitle);
			return clickOnContactTitle;
		}
		
		public WebElement clickOnSelectAllContactCheckBox() {
			return clickOnSelectAllContactCheckBox;
		}
		public WebElement clickOnDeleteLogo() {
			return clickOnDeleteButton;
		}
		public WebElement clickYesOnConfirmationPopup() {
			return confirmDeletingContact;
		}
	
}

