package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages.VtigerHomePage;
import Webpages.VtigerLeadsPage;
import Webpages.VtigerLoginPage;
import mavenUtilities.SeleniumUtility;


public class TestLeadsPage extends SeleniumUtility{
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerLeadsPage getVtigerLeadsPage=null;
	@BeforeTest
	public void prerequisite() {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		getVtigerLoginPage=new VtigerLoginPage(driver);
		getVtigerHomePage=new VtigerHomePage(driver);
		getVtigerLeadsPage=new VtigerLeadsPage(driver);
		getVtigerLoginPage.loginInVtiger("admin", "Test@123");
		getVtigerHomePage.navigateToLeadsPage();
	}

	@Test
	public void testLeadCreation() {
		
		getVtigerLeadsPage.createNewLead("Champak", "Jetha", "9876542536");
		Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation(),"Leads not created");
	}
	
	@Test(dependsOnMethods="testLeadCreation")
	public void testLeadDeletion() {
		getVtigerLeadsPage.deleteCreatedLead();
		Assert.assertTrue(getVtigerLeadsPage.checkLeadCreation(),"Created Lead is not deleted");
	}
	@AfterTest
	public void tearDown() {
		teardown();
	}
}