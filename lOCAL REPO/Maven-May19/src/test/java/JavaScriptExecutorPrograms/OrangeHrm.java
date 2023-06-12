package JavaScriptExecutorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mavenUtilities.SeleniumUtility;

public class OrangeHrm extends SeleniumUtility {

	@Test
	public void OrangeHrmTestCase() throws InterruptedException {
		WebDriver driver= setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement usernameInputField=driver.findElement(By.name("username"));
		waitForElementToBeClickable(usernameInputField);
		js.executeScript("document.getElementsByName('username')[0].value='Admin'");
		js.executeScript("document.getElementsByName('password')[0].value='admin123'");
		Thread.sleep(5000);
		WebElement loginButton=driver.findElement(By.className("orangehrm-login-button"));
		js.executeScript("arguments[0].click()", loginButton);
		
		
	}

}
