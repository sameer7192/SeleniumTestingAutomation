package JavaScriptExecutorPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import mavenUtilities.SeleniumUtility;

public class PracticeProgram extends SeleniumUtility {

	@Test
	public void LoginVtigerPage() {
		WebDriver driver=setUp("chrome", "https://demo.actitime.com/login.do");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value=('admin')");
		js.executeScript("document.getElementsByName('pwd')[0].value=('manager')");
		WebElement element=driver.findElement(By.id("loginButton"));
		js.executeScript("arguments[0].click();", element);
	}
	
	@Test
	public void FlipkartScrollProgram() {
		WebDriver driver=setUp("chrome", "https://www.flipkart.com");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1500)");
		js1.executeScript("window.scrollBy(0,-1500)");
	}
	
}
