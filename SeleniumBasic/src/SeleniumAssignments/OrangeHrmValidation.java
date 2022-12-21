package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmValidation {

	public static void main(String[] args) throws InterruptedException {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath );
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement UsernameInputField= driver.findElement(By.name("username"));
		System.out.println("User Name input Field is displayed or not? "+UsernameInputField.isDisplayed());
		System.out.println("Username input field is functional or not? "+UsernameInputField.isEnabled());
		
		WebElement PasswordinputField= driver.findElement(By.name("password"));
		System.out.println("Password input Field is displayed or not? "+PasswordinputField.isDisplayed());
		System.out.println("Password input field is functional or not? "+PasswordinputField.isEnabled());
		
		WebElement LoginButton= driver.findElement(By.className("oxd-button"));
		System.out.println("Password input Field is displayed or not? "+LoginButton.isDisplayed());
		System.out.println("Password input field is functional or not? "+LoginButton.isEnabled());
		
		//login verification
		String ActualPageTitle= driver.getTitle();
		String ExpectedPageTitle=("OrangeHRM");
		System.out.println("Page Title Length is : "+ActualPageTitle.length());
		System.out.println("Actual page title is : "+ActualPageTitle);
		System.out.println("Expected page title is : "+ExpectedPageTitle);
		System.out.println("Validating Pate title: "+ActualPageTitle.equals(ExpectedPageTitle));
				
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Url validation is : "+ActualUrl.contains("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		
		WebElement LogoutMenu= driver.findElement(By.className("oxd-userdropdown-name"));
		LogoutMenu.click();
		
		
		WebElement LogOutButton=driver.findElement(By.partialLinkText("Logout"));
		LogOutButton.click();
		
		//driver.close();
	}

}
