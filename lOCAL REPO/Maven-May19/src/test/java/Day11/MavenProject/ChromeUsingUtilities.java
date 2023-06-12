package Day11.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import mavenUtilities.DateUtility;
import mavenUtilities.SeleniumUtility;

public class ChromeUsingUtilities {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility S1= new SeleniumUtility();
		WebDriver driver=S1.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		S1.takeScreenShot("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String date=DateUtility.getRequiredDateBasedOnNumberOfDays("ddmmyyhhss", 0);
		String fileName= (".\\src\\test\\resources\\ScreenShots\\OrangeHrmpage"+date+".png");
		S1.takeScreenShot(fileName);
		
				
	}

}
