package testNgPrograms;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mavenUtilities.SeleniumUtility;


public class GoogleApplicationWithBeforeAfterTest extends SeleniumUtility {

	WebDriver driver;

	@BeforeTest
	public void startUp() {
		driver = setUp("chrome", "https://www.google.com/");
	}

	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle, "Google Search page not opened or its title got changed");
	}

	@Test
	public void testSearch() {
		getActiveWebElement().sendKeys("SQL", Keys.ENTER);
		Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
	}

	

	@AfterTest
	public void cleanUp() {
		teardown();
	}
}