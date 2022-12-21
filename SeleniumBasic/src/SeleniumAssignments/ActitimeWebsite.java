package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeWebsite {

	public static void main(String[] args) {
		
		String currentWorkingDir = System.getProperty("user.dir");
		String chromeExePath= currentWorkingDir+"\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		String pageSource= driver.getPageSource();
		System.out.println("Page Source Content Length is : "+pageSource.length());
		System.out.println("Page title is : "+driver.getTitle());
		System.out.println("Page title is : "+driver.getTitle().length());
				
		String actualUrl= driver.getCurrentUrl();
		String expectedUrl= "https://demo.actitime.com";
		System.out.println("Actual Url is : "+actualUrl);
		System.out.println("Expected Url is : "+expectedUrl);
		System.out.println("Page Url Validation is : "+actualUrl.contains(expectedUrl));
		
		driver.close();
		
		
		
	}

}
