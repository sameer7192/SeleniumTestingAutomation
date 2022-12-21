package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfo_1 {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir= System.getProperty("user.dir");
		String ChromePath= currentWorkingDir+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String PageTitle= driver.getCurrentUrl();
		System.out.println("Page title is: "+PageTitle);
		//validating login page
		System.out.println("Title validation status: "+PageTitle.equals("Live cricket scores, match schedules, latest cricket news, cricket videos"));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		//validating login page
		System.out.println("Url validation status: "+pageUrl.contains("https://www.espncricinfo.com/"));
		
		List<WebElement> MainMenu=driver.findElements(By.cssSelector("div section>*:nth-child(3) *:nth-child(2) a"));
		
		for (int i=0;i<MainMenu.size();i++) {
			System.out.println(MainMenu.get(i).getText()+" : ");
			
		}
		Thread.sleep(1000);
		driver.close();
	}

}
