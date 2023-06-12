package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages.VtigerContactPage;
import Webpages.VtigerHomePage;
import Webpages.VtigerLeadsPage;
import Webpages.VtigerLoginPage;
import mavenUtilities.SeleniumUtility;

public class TestContactPage extends SeleniumUtility {
	VtigerLoginPage getVtigerLoginPage=null;
	VtigerHomePage getVtigerHomePage=null;
	VtigerContactPage getVtigerContactPage=null;
	@BeforeTest
	public void prerequisites() {
	WebDriver driver= setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	getVtigerLoginPage = new VtigerLoginPage(driver);
	getVtigerHomePage = new VtigerHomePage(driver);
	getVtigerContactPage= new VtigerContactPage(driver);
	getVtigerLoginPage.loginInVtiger("admin", "Test@123");
	 getVtigerHomePage.navigateToContactsPage();
	}

	@Test
	public void testContactsCreation() {
		getVtigerContactPage.addNewContact("sameer","bude", "9130186316");
		Assert.assertTrue(getVtigerContactPage.checkContactCreation(),"Contact not created");
	}
	
	@Test(dependsOnMethods="testContactsCreation")
	public void testDeletionCreation() {
		getVtigerContactPage.deleteContact();
		Assert.assertTrue(getVtigerContactPage.checkContactCreation(),"Created contact is not deleted");
		
	}
	@AfterTest
	public void tearDown() {
		teardown();
	}
}
