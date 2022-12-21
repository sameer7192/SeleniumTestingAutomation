package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHrmLocator {

	public static void main(String[] args) {
		
		String currentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath=currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement username= driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("Admin");
		

		WebElement password= driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("admin123");
		
		WebElement submit= driver.findElement(By.className("oxd-button"));
		submit.click();
		
		//oxd-button oxd-button--medium oxd-button--main orangehrm-login-button
		
		//driver.close();
		
	}

}
