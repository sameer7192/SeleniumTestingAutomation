package StepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import mavenUtilities.SeleniumUtility;

public class AmazonMobileStepDef extends SeleniumUtility{
	
	 @Given("^user is already on amazon website$")
	    public void user_is_already_on_amazon_website()  {
	        driver=setUp("chrome", "https://www.amazon.in/");
	    }

	    @And("^user search redmi 12Pro mobile in search option$")
	    public void user_search_redmi_12pro_mobile_in_search_option()  {
	        waitForElementDisplayed(driver.findElement(By.cssSelector("#nav-search-submit-button")));
	    	driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
	        driver.findElement(By.cssSelector(".nav-search-field #twotabsearchtextbox")).sendKeys("redmi 12Pro", Keys.ENTER);
	    }

	    @And("^user click on required mobile on search page$")
	    public void user_click_on_required_mobile_on_search_page()  {
	        driver.findElement(By.xpath("//div[@class=\"a-section\"]/div/div[2]/div/div/div/h2/a/span"));
	    }

	    @And("^user switch to next window$")
	    public void user_switch_to_next_window()  {
	    	String homePageWinID= driver.getWindowHandle();
	    	driver.findElement(By.xpath("//div[@class=\"a-section\"]/div/div[2]/div/div/div/h2/a/span")).click();
	    	Set<String> allWinIds = driver.getWindowHandles();
			allWinIds.remove(homePageWinID);
			Iterator<String> itr = allWinIds.iterator();
			String childWinId = itr.next();
			driver.switchTo().window(childWinId);
	    	
	        //driver.switchTo().window("https://www.amazon.in/s?k=redmi+12pro&crid=13IU3WU4MEUYJ&sprefix=%2Caps%2C570&ref=nb_sb_ss_recent_1_0_recent");
	    }

	    @And("^user click on add cart button$")
	    public void user_click_on_add_cart_button()  {
	        driver.findElement(By.cssSelector("span[id=\"submit.add-to-cart\"]")).click();
	    }

	    @And("^user click on cart option$")
	    public void user_click_on_cart_option()  {
	        driver.findElement(By.id("attach-view-cart-button-form")).click();
	    }

	    @And("^user delete mobile from cart$")
	    public void user_delete_mobile_from_cart()  {
	     driver.findElement(By.xpath("//input[@data-action=\"delete\"]")).click();   
	    }
	    @And("Close the browser")
	    public void close_the_browser() {
	        driver.quit();
	       
	    }

}
