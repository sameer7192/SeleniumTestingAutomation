package SeleniumAssignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimePropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis= new FileInputStream("D:\\software testing\\AutomationWorkspace\\SeleniumBasic\\PropertyFileSelenium\\ActitimeData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String driverExecutablePath=prop.getProperty("driverExecutablePath");
		String driverKey= prop.getProperty("driverKey");
		String appUrl= prop.getProperty("appUrl");
		String username = prop.getProperty("username");
		String password= prop.getProperty("password");
		String loginPageTitle= prop.getProperty("loginPageTitle");
		String buttonName= prop.getProperty("buttonName");
		
		System.out.println(driverExecutablePath+"\n"+driverKey+"\n"+appUrl+"\n"+username+"\n"+password+"\n"+loginPageTitle+"\n"+buttonName);
		
		//String chromeExePath=System.getProperty("user.dir")+driverExecutablePath;
		//setting the path for driver executable
		System.setProperty(driverKey, driverExecutablePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//to enter required application URL use get() of WebDriver interface
		driver.get(appUrl);
		//to get title from the application use getTitle() of WebDriver interface
		String pageTitle=driver.getTitle();
				
		System.out.println("Page title is: "+pageTitle);
		System.out.println("Page title length: "+pageTitle.length());
		//validating login page
		System.out.println("Title validation status: "+pageTitle.equals(loginPageTitle));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		//validating login page
		System.out.println("Url validation status: "+pageUrl.contains(appUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source: "+pageSource);
		System.out.println("Page Source length: "+pageSource.length());
	
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys(username);
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys(password);
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(2000);
		driver.close();
		
	
	}

}
