package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Webpages.ActiTimeLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenUtilities.SeleniumUtility;


public class ActiTimeTaskWithStepDef extends SeleniumUtility {
		ActiTimeLoginPage actiTimeLoginPage;
		WebDriver driver;
		
		@Given("^User already on ActiTime Login Page$")
	    public void user_already_on_actitime_login_page(){
	        driver = setUp("chrome", "https://demo.actitime.com/login.do");
	        actiTimeLoginPage = new ActiTimeLoginPage(driver);
	    }

	    @And("^User login with valid username and password$")
	    public void user_login_with_valid_username_and_password(){
	       actiTimeLoginPage.enterUsername();
	       actiTimeLoginPage.enterPassword();
	       actiTimeLoginPage.clickOnLoginButton();
	    }
	    
	    @And("^User goes to Task Creattion Window and click on add new task$")
	    public void user_goes_to_task_creattion_window_and_click_on_add_new_task(){
	        actiTimeLoginPage.clickOnTaskIcon();
	        actiTimeLoginPage.clickOnAddNewTask();
	    }

	    @And("^user click on new task$")
	    public void user_click_on_new_task(){
	        actiTimeLoginPage.clickOnNewTask();
	    }
	    
	    @When("^User select Customer as Galaxy Corporation and Project as Android Testing$")
	    public void user_select_customer_as_galaxy_corporation_and_project_as_android_testing(){
	        actiTimeLoginPage.clickOnCustomer();
	        actiTimeLoginPage.selectCustomer();
	        actiTimeLoginPage.selectOnProjectField();
	        actiTimeLoginPage.selectProject();
	    }

	    @And("^User enter task name as Automation Tester$")
	    public void user_enter_task_name_as_automation_tester(){
	        actiTimeLoginPage.enterTaskName();
	    }

	    @And("^User click on create task buton$")
	    public void user_click_on_create_task_buton(){
	        actiTimeLoginPage.clickOnCreateTask();
	    }
	    
	    @And("^click on check box and click on delete logo$")
	    public void click_on_check_box_and_click_on_delete_logo(){
	        actiTimeLoginPage.selectCheckBox();
	        actiTimeLoginPage.clickOnDeleteLogo();
	    }

	    @And("^click on delete permanently popUp$")
	    public void click_on_delete_permanently_popup(){
	        actiTimeLoginPage.clickOnDeletePermanently();
	    }

	    @And("^user should verify task deleted or not$")
	    public void user_should_verify_task_deleted_or_not(){
	        actiTimeLoginPage.checkTaskDeleted();
	    }
	    
	    @Then("^User should verify Task created or not$")
	    public void user_should_verify_task_created_or_not()  {
	    	actiTimeLoginPage.checkTaskCreation();
	    }


	    
}
