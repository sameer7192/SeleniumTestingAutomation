package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerLocator {

	public static void main(String[] args) {
		
		String currentWorkingDir= System.getProperty("user.dir");
		String ChromePath= currentWorkingDir+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath );
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		
		WebElement username=driver.findElement(By.name("username"));
		
		username.clear();
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.name("password"));
		
		password.clear();
		password.sendKeys("Test@123");
		
		WebElement button= driver.findElement(By.id("buttonBlue"));
		
		button.click();
		
		driver.close();
		
		
		
	}

}
