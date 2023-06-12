package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages.VtigerContactPage;
import Webpages.VtigerHomePage;
import Webpages.VtigerLoginPage;
import Webpages.VtigerOrganizationPage;
import mavenUtilities.SeleniumUtility;

public class TestOrganizationPage extends SeleniumUtility{

	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerContactPage getVtigerContactPage=null;
	VtigerOrganizationPage getVtigerOrganizationPage=null;
	
	
	@BeforeTest
	public void prerequisites() {
	WebDriver driver= setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	getVtigerLoginPage = new VtigerLoginPage(driver);
	getVtigerHomePage = new VtigerHomePage(driver);
	getVtigerOrganizationPage= new VtigerOrganizationPage(driver);
	getVtigerLoginPage.loginInVtiger("admin", "Test@123");
	 getVtigerHomePage.navigateToOrganizationPage();
	}
	@Test
	public void testOrganizationCreation() {
		getVtigerOrganizationPage.addNewOrganization("Sameer Developer","www.google.com", "9130186316");
		Assert.assertTrue(getVtigerOrganizationPage.checkOrganizationCreation(),"Organization not created");
	}
	

	@Test(dependsOnMethods="testOrganizationCreation")
	public void testDeletionCreation() {
		getVtigerOrganizationPage.deleteCreatedOrganization();
		Assert.assertTrue(getVtigerOrganizationPage.checkOrganizationCreation(),"Created Organization is not deleted");
		
	}
//	@AfterTest
//	public void tearDown() {
//		cleanUp();
//	}
	

}