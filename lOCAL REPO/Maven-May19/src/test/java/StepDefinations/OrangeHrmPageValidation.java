package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenUtilities.SeleniumUtility;

public class OrangeHrmPageValidation extends SeleniumUtility {
	
	WebDriver driver;    
        @Given("^user already on OrangeHRM login Page$")
        public void user_already_on_orangehrm_login_page()  {
        	driver=setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
        }

        @When("^user type (.+) in username field$")
        public void user_type_in_username_field(String username)  {
        	driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
        }

        @Then("^user validate Title with (.+)$")
        public void user_validate_title_with(String title)  {
        	System.out.println("home page validation : "+getCurrentTitleOfApplication().equals(title));
        }

        @And("^user type (.+) in password field$")
        public void user_type_in_password_field(String password)  {
        	 driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        }

        @And("^user click on login button$")
        public void user_click_on_login_button()  {
        	 driver.findElement(By.cssSelector(".oxd-button")).click();
        }

        @And("^user close Orange HRM Browser$")
        public void user_close_orange_hrm_browser()  {
            teardown();
        }
        

    }

    
    
