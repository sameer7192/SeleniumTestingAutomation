package testScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Webpages.ActitimeLoginPageNew_1;
import Webpages.ActitimeTaskPage;
import mavenUtilities.SeleniumUtility;

public class TestActitimeTaskPage extends SeleniumUtility {
	ActitimeLoginPageNew_1 getActitimeLoginPageNew_1=null;
	ActitimeTaskPage getActitimeTaskPage=null;
	
  @Test
  public void prerequisites() {
	  WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
	  getActitimeLoginPageNew_1= new ActitimeLoginPageNew_1(driver);
	  getActitimeTaskPage=new ActitimeTaskPage(driver);
	  getActitimeLoginPageNew_1.LoginActitime("admin", "manager");
	  getActitimeTaskPage.navigateToTaskPage();
  }
  
  @Test(dependsOnMethods = "prerequisites")
  public void createNewTask() {
	  getActitimeTaskPage.createNewTask("Automation Test Engineer");
	  
  }
  
  @Test(dependsOnMethods= "createNewTask")
  public void deleteTask() {
	  getActitimeTaskPage.DeleteTask();
	  teardown();
  }
}
