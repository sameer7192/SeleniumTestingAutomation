package Day2.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLogin {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("user.dir");/*F:\\JavaWorkspace\\SeleniumTesting*/
		String chromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		//ChromeDriver cdriver=new ChromeDriver(); //or
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		/**
		 * to perform any operation first we need to identify the object/element from the 
		 * application dn you can perform any required operation:
		 * 		input type: sendkeys("Input");
		 * 		click	  : click();
		 * 		existing text deletion: clear();
		 */
		/*Identify User name field*/
		WebElement username=driver.findElement(By.id("username"));
		/*perform require operation in the username field*/
		username.clear();
		username.sendKeys("admin");
		
		/*Identify password field*/
		WebElement pwd=driver.findElement(By.name("password"));
		/*perform require operation in the pwd field*/
		pwd.clear();
		pwd.sendKeys("Test@123");
		
		/*Identify Sign in Button*/
		WebElement signInButton=driver.findElement(By.className("buttonBlue"));
		/*perform require operation in the Sign in Button*/
		signInButton.click();
		
		driver.close();
	}

}