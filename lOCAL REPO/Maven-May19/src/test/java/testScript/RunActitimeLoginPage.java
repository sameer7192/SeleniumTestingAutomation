package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Webpages.ActiTimeLoginPage;
import Webpages.ActitimeLoginPageNew_1;
import junit.framework.Assert;
import mavenUtilities.SeleniumUtility;

public class RunActitimeLoginPage extends SeleniumUtility{
	@Test
	public void LoginActitime() {
		WebDriver driver= setUp("chrome", "https://demo.actitime.com/login.do");
		ActitimeLoginPageNew_1 ActitimeLoginPageNew= new ActitimeLoginPageNew_1(driver);
		ActitimeLoginPageNew.LoginActitime("admin", "manager");
		
		Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME -  Enter Time-Track", "Login is not done successfully");
		
	}

}
