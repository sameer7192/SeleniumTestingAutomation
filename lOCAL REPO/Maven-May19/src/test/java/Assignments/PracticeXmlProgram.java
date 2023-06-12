package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mavenUtilities.SeleniumUtility;

public class PracticeXmlProgram extends SeleniumUtility {
  @Test
  public void TestCaseOne() {
	  setUp("chrome", "https://demo.actitime.com/login.do");
	  driver.findElement(By.cssSelector("input[id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name=\"pwd\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
	    }
  
  @Test
  public void TestCaseTwo() {
	  setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	  driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	  
  }
  
  @Test
  public void TestCaseThree() {
	  setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 		
		WebElement username= driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("Admin");
		

		WebElement password= driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("admin123");
		
		WebElement submit= driver.findElement(By.className("oxd-button"));
		submit.click();
	  
  }
  
   
}
