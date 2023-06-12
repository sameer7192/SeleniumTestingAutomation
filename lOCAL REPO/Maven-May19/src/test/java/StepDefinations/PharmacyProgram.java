package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mavenUtilities.SeleniumUtility;

public class PharmacyProgram extends SeleniumUtility {
		WebDriver driver;

	    @Given("^User is already on pharmacy home page$")
	    public void user_is_already_on_pharmacy_home_page()  {
	    	driver=setUp("chrome", "https://pharmeasy.in/");
	        
	    }

	    @When("^user search for Dolo 650 tablet in search field$")
	    public void user_search_for_dolo_650_tablet_in_search_field()  {
	    	driver.findElement(By.cssSelector(
					"div[class=\"c-IkEYc c-IkEYc-idhSfxX-css\"] div[class=\"c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-fMErMJ-justify-left c-bXbWpx-joJbDg-align-center c-bXbWpx-ielOayq-css\"]"))
					.click();
	        driver.findElement(By.id("topBarInput")).sendKeys("Dolo 650");
	       
	    }

	    @Then("^User validate dolo 650 is added to cart$")
	    public void user_validate_dolo_650_is_added_to_cart()  {
	    driver.findElement(By.xpath("//span[text()='View Cart']")).click();
	    driver.findElement(By.xpath("//p[text()='Dolo (Paracetamol) 650mg Strip Of 15 Tablets']")).isDisplayed();
	       
	    }

	    @And("^choose 2nd option of strip of 15tablets$")
	    public void choose_2nd_option_of_strip_of_15tablets()  {
	        driver.findElement(By.xpath("//span[text()='Dolo (Paracetamol) 650mg Strip Of 15 Tablets']")).click();
	    }

	    @And("^choose quantity as 3nos$")
	    public void choose_quantity_as_3nos()  {
	        driver.findElement(By.xpath("//li[text()='3']")).click();
	        
	    }

	    @And("^go to Add to cart$")
	    public void go_to_add_to_cart()  {
	        driver.findElement(By.xpath("//button[text()='Add To Cart']")).click();
	    }

	    @And("^user delete dolo 650 added in cart$")
	    public void user_delete_dolo_650_added_in_cart()  {
	       driver.findElement(By.cssSelector("img[alt='close']")).click();
	       driver.findElement(By.xpath("//span[text()='Remove']")).click();
	    }

	    @And("^User close the browser$")
	    public void user_close_the_browser()  {
	        teardown();
	    }

	}