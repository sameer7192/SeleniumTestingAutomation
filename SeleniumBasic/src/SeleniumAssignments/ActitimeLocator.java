package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLocator {

	public static void main(String[] args) {
	
		String currentWorkingDir=System.getProperty("user.dir");
		String ChromeExePath= currentWorkingDir+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("trainee");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("trainee");
		
		WebElement button = driver.findElement(By.id("loginButton"));
		button.click();
		
		driver.close();
		
	}

}
