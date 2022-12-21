package Day1.OpenBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\software testing\\AutomationWorkspace\\SeleniumBasic\\Executables\\geckodriver.exe");
		
		FirefoxDriver fdriver= new FirefoxDriver();
		
		fdriver.get("https://www.google.com");
	
	
//System.setProperty("webdriver.gecko.driver",
//		"F:\\JavaWorkspace\\SeleniumTesting\\Executables\\geckodriver.exe");
//FirefoxDriver fdriver = new FirefoxDriver();
//fdriver.get("https://www.google.com");
	}

	}