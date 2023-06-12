package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Webpages.VtigerLoginPage;
import mavenUtilities.SeleniumUtility;


public class TestLoginPage extends SeleniumUtility{

	@Test
	public void testVtigerLogin() {
		//step1: Open chrome browser and enter app url
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		VtigerLoginPage getVtigerLoginPage=new VtigerLoginPage(driver);		
		//step2: login with valid cred in vtiger
		getVtigerLoginPage.loginInVtiger(getValueFromPropertyFile("username"),getValueFromPropertyFile("password") );
		//Step3: validate Vtiger home page opened or not
		Assert.assertEquals(getCurrentTitleOfApplication(), getValueFromPropertyFile("expectedHomePageTitle"),"Login was not successfull or title got changed");
		//step4: close the browser
		//cleanUp();
	}
}
