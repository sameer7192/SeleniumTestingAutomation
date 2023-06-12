package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenUtilities.SeleniumUtility;


public class VtigerLeadStepDef extends SeleniumUtility {

    @Given("^user already in login page$")
    public void user_already_in_login_page() {
        setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
    }

    @And("^user login successfully with valid data$")
    public void user_login_successfully_with_valid_data() {
        driver.findElement(By.cssSelector("button[class=\"button buttonBlue\"]"));
        
    }

    @And("^click on navigation bar$")
    public void click_on_navigation_bar() {
        driver.findElement(By.id("appnavigator")).click();
    }

    @And("^go to Marketing and select Leads$")
    public void go_to_marketing_and_select_leads() {
        driver.findElement(By.xpath("//span[contains(text(),'MARKETING')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Leads')]"));
    }
    @When("^click on Add Leads button and enter firstname as (.+) ,last as (.+) ,number as (.+) and click on save button$")
    public void click_on_add_leads_button_and_enter_firstname_as_last_as_number_as_and_click_on_save_button(String firstname, String lastname, String number) {
        driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
        driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys(firstname, Keys.ENTER);
        driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys(lastname, Keys.ENTER);
        driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys(number , Keys.ENTER);
        driver.findElement(By.className(".saveButton")).click();
    }

    @Then("^varify lead is created with (.+)$")
    public void varify_lead_is_created_with(String lastname) {
        driver.findElement(By.xpath(" //h4[contains(text(),'Leads ')]")).click();
        WebElement createdTask=driver.findElement(By.xpath("//a[contains(text(),'lastname'])"));
	       Assert.assertTrue(isElementExist(createdTask), "Task not created");
    }

    @And("^click on All link$")
    public void click_on_all_link() {
    	driver.findElement(By.xpath(" //h4[contains(text(),'Leads ')]")).click();
    }

    @And("^close the browser$")
    public void close_the_browser() {
        teardown();
    }

    
    
    
    
    
    

}