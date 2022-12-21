package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeTaskAssignment {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir = System.getProperty("user.dir");
		String chromeExePath= currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		
		String getTitle= driver.getTitle();
		System.out.println("Page Title Length is : "+getTitle.length());
		System.out.println("Page title is : "+getTitle);
		System.out.println("Page title validation is : "+getTitle.equals("actiTIME - Login"));
				
		String actualUrl= driver.getCurrentUrl();
		String expectedUrl= "https://demo.actitime.com";
		System.out.println("Actual Url is : "+actualUrl);
		System.out.println("Expected Url is : "+expectedUrl);
		System.out.println("Page Url Validation is : "+actualUrl.contains(expectedUrl));
		
		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.clear();
		password.sendKeys("manager");
		WebElement button = driver.findElement(By.id("loginButton"));
		button.click();
		Thread.sleep(2000);
		//click on tasks
		//driver.findElement(By.id("container_tasks")).click();
		//click on add new
		//driver.findElement(By.className("ellipsis")).click();
		//click on add new task option
		//driver.findElement(By.className("createNewTasks")).click();
		//
		//driver.findElement(By.cssSelector(".customerSelector div[class='dropdownButton']")).click();
		
		//driver.findElement(By.cssSelector(".customerSelector .searchItemList>*:nth-child(3)")).click();
//		driver.findElement(By.cssSelector(".projectSelector .dropdownButton")).click();
//		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(4)")).click();
//		driver.findElement(By.cssSelector("input[placeholder=\"Enter task name\"]")).sendKeys("Application Automation Testing");
//		driver.findElement(By.cssSelector("div[class='components_button withPlusIcon']")).click();
//		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).click();
//		driver.findElement(By.cssSelector("input[placeholder='Enter task name']")).sendKeys("Automation Testing");

		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		driver.findElement(By.cssSelector(".createNewTasks")).click();		
		driver.findElement(By.cssSelector(".customerSelector .selectedItem")).click();
//		driver.findElement(By.cssSelector(".customerSelector .searchItemList>*:nth-child(8)")).click();
//		driver.findElement(By.cssSelector(".projectSelector .dropdownButton")).click();
//		driver.findElement(By.cssSelector(".projectSelector .searchItemList>*:nth-child(5)")).click();
//		driver.findElement(By.cssSelector("input[placeholder=\"Enter task name\"]")).sendKeys("Automation_Testing");
//		driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label ")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("div[class=\"createdTasksTableContainer\"] .img")).click();
//		driver.findElement(By.cssSelector("div[class = \"delete button\"]")).click();
//		driver.findElement(By.cssSelector(".dialogWithPointerWrapper .operationConfirmDialogInnerContainer span[class=\"submitTitle buttonTitle\"]")).click();
		//driver.close();
		
		
		
	}

}
