package StepDefinations;

import org.openqa.selenium.WebDriver;

import Webpages.VtigerContactPage;
import Webpages.VtigerHomePage;
import Webpages.VtigerLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenUtilities.SeleniumUtility;

public class VtigerContactStepDef extends SeleniumUtility {
	VtigerHomePage getVtigerHomePage;
	VtigerLoginPage getVtigerLoginPage;
	VtigerContactPage getVtigerContactPage;
	WebDriver driver;
	
	 @Given("^user is in login page$")
	    public void user_already_in_login_page()  {
	       driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	       getVtigerHomePage = new VtigerHomePage(driver);
	       getVtigerLoginPage=new VtigerLoginPage(driver);
	       getVtigerContactPage=new VtigerContactPage(driver);
	       }
	
	@And("^user login successfully with correct data$")
    public void user_login_successfully_with_correct_data()  {
	getVtigerLoginPage.loginInVtiger("admin", "Test@123");
    }

	@And("^click on menu bar$")
	public void click_on_menu_bar()  {
    	clickOnElement(getVtigerHomePage.getFlowNavigator());
    }
	@And("go to Marketing and select Contact")
	public void go_to_marketing_and_select_contact() {
		clickOnElement(getVtigerHomePage.goToMarketingOption());
        clickOnElement(getVtigerHomePage.goToContactOption()); 
	}
    
    @When("^User click on add contact$")
    public void user_click_on_add_contact() throws InterruptedException  {
    	getVtigerContactPage.clickOnAddNewContactButton();
    }

    @Then("^check contacts is created or not$")
    public void check_contacts_is_created_or_not()  {
    	getVtigerContactPage.checkContactCreation();
    }

    @And("^user enter firstname as (.+), lastname as (.+), mobilenumber as (.+) and click on save button$")
    public void user_enter_firstname_as_lastname_as_mobilenumber_as_and_click_on_save_button(String fname, String lname, String number)  {
    	getVtigerContactPage.addNewContact(fname, lname, number);
    }

    @And("^click on contact header link$")
    public void click_on_contact_header_link()  {
    	clickOnElement(getVtigerContactPage.clickOnContactHeaderLink());
    }
    @When("^user selects on all contact check box$")
    public void user_selects_on_all_contact_check_box()  {
    	clickOnElement(getVtigerContactPage.clickOnSelectAllContactCheckBox());
    }

    @Then("^verify if contacts is deleted or not$")
    public void verify_if_contacts_is_deleted_or_not()  {
    	getVtigerContactPage.checkContactCreation();
    }

    @And("^click on delete logo$")
    public void click_on_delete_logo()  {
    	clickOnElement(getVtigerContactPage.clickOnDeleteLogo());
    }

    @And("^click on confirmation popup$")
    public void click_on_confirmation_popup()  {
    	clickOnElement(getVtigerContactPage.clickYesOnConfirmationPopup());
    }
    
}
