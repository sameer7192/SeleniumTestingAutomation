package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ErailChromeBrowser {

	public static void main(String[] args) {
		String currentWorkingDir= System.getProperty("user.dir");
		String chromeExePath= currentWorkingDir+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in");
		
		String currentUrl=driver.getCurrentUrl();
		String expectedUrl="https://erail.in";
		
		System.out.println("Actual Url is : "+currentUrl);
		System.out.println("Expected Url is : "+expectedUrl);
		System.out.println("Url validation is : "+currentUrl.contains(expectedUrl));
		
		driver.close();

	}

}
