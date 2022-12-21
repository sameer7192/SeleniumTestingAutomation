package Day1.OpenBrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\software testing\\AutomationWorkspace\\SeleniumBasic\\Executables\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		
		cdriver.get("https://www.google.com");
	}

}
