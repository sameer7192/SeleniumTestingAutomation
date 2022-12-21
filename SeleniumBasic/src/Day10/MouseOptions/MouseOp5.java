package Day10.MouseOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Day0.SeleniumUtilities.SeleniumUtility;


public class MouseOp5 extends SeleniumUtility{

	public static void main(String[] args) {
		
		MouseOp5 m1=new MouseOp5();
		WebDriver driver=m1.setUp("chrome", "https://www.facebook.com/");
		m1.performClick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
		m1.typeInput(userNameInputField, "admin");
		m1.copyTextFromField(userNameInputField);
		WebElement lastName=driver.findElement(By.name("lastname"));
		m1.pasteTextInToField(lastName);
	}
}