package testNgPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mavenUtilities.SeleniumUtility;


public class GoogleApplicationWithBeforeAfter extends SeleniumUtility {

	WebDriver driver;

	@BeforeTest
	public void startUp() {
		driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.cssSelector(".buttonBlue")).click();
	}

	@Test
	public void testVtigerHomePage() {
		String expectedTitle = "Dashboard";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Vtiger home page not opened or its title got changed");
	}

	@Test
	public void testReportsPage() {
		driver.findElement(By.xpath("//a[@title='Reports']")).click();
		String expectedTitle = "Reports";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Reports page not opened or its title got changed");
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.cssSelector(".userName ")).click();
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}

	@AfterTest
	public void cleanUp() {
		teardown();
	}
}