package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChrome {

	public static void main(String[] args) {
		
		String CurrentWorkingDir= System.getProperty("user.dir");
		String ChromePath= CurrentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",ChromePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String ActualTitle= driver.getTitle();
		String ExpectedTitle= "Google";
		System.out.println("Actual title is : "+ActualTitle);
		System.out.println("Expected title is : "+ExpectedTitle);
		System.out.println("Title validation is : "+ActualTitle.equals(ExpectedTitle));
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.google.com";
		System.out.println("Actual Url is : "+actualUrl);
		System.out.println("Expected Url is : "+expectedUrl);
		System.out.println("Title validation is : "+actualUrl.contains(expectedUrl));
		
		String pageSource=driver.getPageSource();
		System.out.println("Page Source content lentgh is :  "+pageSource.length());
		
		driver.close();
		
		
	}

}
