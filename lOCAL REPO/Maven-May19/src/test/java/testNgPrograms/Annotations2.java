package testNgPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mavenUtilities.SeleniumUtility;

public class Annotations2 extends SeleniumUtility {
	WebDriver driver;
	@BeforeTest
	public void startUp() {
		System.out.println("Open browser and login into application");
		driver = setUp("chrome", "https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	}
	@Test(priority=1)
	public void taskCreation() throws InterruptedException {
		System.out.println("Create new task");
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Tasks']")).click();
		//waitTillElementIsClickable(driver.findElement(By.xpath("//tr[@class=\\\"selectCustomerRow\\\"]/td/div/div")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[@class=\"selectCustomerRow\"]/td/div/div")).click();
		driver.findElement(By.xpath("//div[@class=\"searchItemList\"]/div[text()='Galaxy Corporation']")).click();
		driver.findElement(By.xpath("//tr[@class=\"selectProjectRow projectSelectorRow\"]/td/div/div")).click();
		driver.findElement(By.xpath("//div[@class=\"scrollableDropdownView\"]/div/div/div/div[text()='Android testing']")).click();
		WebElement Task1=driver.findElement(By.xpath("//input[@placeholder=\"Enter task name\"]"));
		Task1.click();
		Task1.sendKeys("Automation Testing Manual");
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		Thread.sleep(2000);
	
	
	
	}
	@Test(priority=2)
	public void deleteTask() throws InterruptedException {
		System.out.println("Delete new task");
		driver.findElement(By.xpath("//div[@class='taskRowsTableContent']/div/div/table/tbody/tr/td/div/div[@class='img']")).click();
		driver.findElement(By.xpath("//div[@class='loadingContainer ']/div/div/div[6]")).click();
		driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
	}
	@AfterTest
	public void cleanUp() {
		System.out.println("logout and close browser");
		teardown();
	}
}