package StepDefinations;

import org.openqa.selenium.WebDriver;

import Webpages.VtigerHomePage;
import Webpages.VtigerLoginPage;
import Webpages.VtigerServicesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenUtilities.SeleniumUtility;

public class VtigerSalesServiceStepDef extends SeleniumUtility{

	VtigerHomePage getVtigerHomePage;
	VtigerLoginPage getVtigerLoginPage;
	VtigerServicesPage getVtigerServicesPage;
	WebDriver driver;
	
	 @Given("^user is already on login page$")
	    public void user_is_already_on_login_page()  {
		 driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	       getVtigerHomePage = new VtigerHomePage(driver);
	       getVtigerLoginPage=new VtigerLoginPage(driver);
	       getVtigerServicesPage= new VtigerServicesPage(driver);
	       }

	    @And("^user has logged In successfully with correct data$")
	    public void user_has_logged_in_successfully_with_correct_data()  {
	    	getVtigerLoginPage.loginInVtiger("admin", "Test@123");
	    }

	    @And("^click on Navigation Bar$")
	    public void click_on_navigation_bar()  {
	    	clickOnElement(getVtigerHomePage.getFlowNavigator());
	    }

	    @And("^go to sales and select services$")
	    public void go_to_sales_and_select_services()  {
	    	clickOnElement(getVtigerHomePage.goToSalesOption());
	    	clickOnElement(getVtigerHomePage.goToSalesServicesOption());
	    }
	    @When("^click on add new service$")
	    public void click_on_add_new_service()  {
	    	clickOnElement(getVtigerServicesPage.clickOnAddNewServiceButton());
	    }

	    @Then("^Verify if services created or not$")
	    public void verify_if_services_created_or_not()  {
	    	getVtigerServicesPage.checkServicesCreation();
	    }

	    @And("^Enter serviceName as (.+) , webSite as (.+) and Click on Save Button$")
	    public void enter_servicename_as_website_as_and_click_on_save_button(String Cname, String website)  {
	    	getVtigerServicesPage.addNewService(Cname, website);
	    }

	    @And("^click on Services Header link$")
	    public void click_on_services_header_link()  {
	      clickOnElement(getVtigerServicesPage.clickOnServicesHeaderLink());
	    }
	    
	    @When("^click on all services check box$")
	    public void click_on_all_services_check_box()  {
	    	clickOnElement(getVtigerServicesPage.selectAllServicesCheckBox());
	    }

	    @Then("^verify if services deleted or not$")
	    public void verify_if_services_deleted_or_not()  {
	    	getVtigerServicesPage.checkServicesCreated();
	    }

	    @And("^click on delete logo button$")
	    public void click_on_delete_logo_button()  {
	    	clickOnElement(getVtigerServicesPage.selectDeleteLogo());
	    }

	    @And("^click on confirmation popUp$")
	    public void click_on_confirmation_popup()  {
	    	clickOnElement(getVtigerServicesPage.clickYesOnCOnfirmationPopup());
	    }

	
}
