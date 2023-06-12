package Day12.SwitchMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavenUtilities.SeleniumUtility;

public class HandlingActiveElements {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/");
		//login into the application without identifying username and password field
		
		//verify mouse pointer is in username input field
		WebElement username=driver.switchTo().activeElement();
		String str=username.getAttribute("placeholder");
		System.out.println("username input field by default is : "+str);
		System.out.println("is mouse pointer present in Username input field? "+str.equals("Username"));
		username.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);		
	}
}