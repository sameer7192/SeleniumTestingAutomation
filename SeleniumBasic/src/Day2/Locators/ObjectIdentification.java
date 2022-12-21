package Day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//type username as admin
		WebElement username=driver.findElement(By.id("username"));
		/**
		 * Once the WebElement is identified you can perform any of the below mentioned operations depending on requirement 
		 * Operation: type  ----------> sendKeys();
		 * 			 click  ----------> click();
		 * 			existing delete---> clear()
		 */
		username.clear();
		username.sendKeys("admin");
		//identify password field
		WebElement pwd=driver.findElement(By.name("password"));
		//perform required operation
		pwd.clear();
		pwd.sendKeys("Test@123");
		
		//identify password field
		WebElement submitBtn=driver.findElement(By.className("buttonBlue"));
		//perform required operation
		submitBtn.click();
		
		driver.close();
	}

}