package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLocatorAccess {

	public static void main(String[] args) {
		
		String CWD= System.getProperty("user.dir");
		String CEP= CWD+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", CEP );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");
		
		WebElement button = driver.findElement(By.className("buttonBlue"));
		button.click();
		
		//driver.close();

	}

}
