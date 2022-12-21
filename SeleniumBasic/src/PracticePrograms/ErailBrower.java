package PracticePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ErailBrower {

	public static void main(String[] args) {
		String currentWorkingDir= System.getProperty("user.dir");
		String firefoxExePath= currentWorkingDir+"//Executables//geckodriver.exe";
		System.setProperty("webdriver.geckodriver.driver", firefoxExePath);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://erail.in");
		
		String currentUrl=driver.getCurrentUrl();
		String expectedUrl="https://erail.in";
		
		System.out.println("Actual Url is : "+currentUrl);
		System.out.println("Expected Url is : "+expectedUrl);
		System.out.println("Url validation is : "+currentUrl.contains(expectedUrl));
		
		driver.close();

	}

}
