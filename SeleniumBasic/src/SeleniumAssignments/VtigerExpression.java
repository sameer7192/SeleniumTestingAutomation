package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerExpression {

	public static void main(String[] args) {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath );
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String PageTitle= driver.getTitle();
		//String ExpectedPageTitle= "vtiger";
		System.out.println("Page Title is : "+PageTitle);
		System.out.println(" Page title validation : "+PageTitle.equals("vtiger"));
		String HomeUrl= driver.getCurrentUrl();
		System.out.println("Home Page Url Validation : "+HomeUrl.contains("https://demo.vtiger.com/vtigercrm/index.php"));
		
		WebElement UsernameInputFIeld=driver.findElement(By.name("username"));
		UsernameInputFIeld.clear();
		UsernameInputFIeld.sendKeys("admin");
		
		WebElement PasswordInputField=driver.findElement(By.name("password"));
		PasswordInputField.clear();
		PasswordInputField.sendKeys("Test@123");
		
		driver.findElement(By.className("button")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();

		driver.findElement(By.cssSelector("a[data-name='History']")).click();
	
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("a[data-name='CalendarActivities']")).click();
		
		driver.findElement(By.cssSelector(".addButton")).click();
		
		driver.findElement(By.cssSelector("a[data-name='GroupedBySalesStage']")).click();
		
	}

}
