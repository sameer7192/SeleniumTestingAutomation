package StepDefinations;


import mavenUtilities.SeleniumUtility;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSearchStepDef extends SeleniumUtility {

    @Given("^User has already on google search page$")
    public void user_has_already_on_google_search_page()  {
    	setUp("chrome", "https://www.google.co.in/");
    }

    @When("^user types (.+) in search input field and press enter key$")
    public void user_types_in_search_input_field_and_press_enter_key(String texttobesearched)  {
    	driver.findElement(By.className("gLFyf")).sendKeys(texttobesearched, Keys.ENTER);
    }

    @Then("^User should able to get result page with title having (.+)$")
    public void user_should_able_to_get_result_page_with_title_having(String texttobesearched)  {
    	texttobesearched.contains(getCurrentTitleOfApplication());
    }
    @And("^Close the Browser$")
    public void close_the_browser()  {
       teardown(); 
    }

}