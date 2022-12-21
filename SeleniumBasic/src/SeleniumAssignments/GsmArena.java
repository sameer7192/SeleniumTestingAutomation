package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir= System.getProperty("user.dir");
		String ChromePath= currentWorkingDir+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String PageTitle= driver.getCurrentUrl();
		System.out.println("Page title is: "+PageTitle);
		//validating login page
		System.out.println("Title validation status: "+PageTitle.equals("GSMArena.com - mobile phone reviews, news, specifications and more..."));
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page Url is: "+pageUrl);
		//validating login page
		System.out.println("Url validation status: "+pageUrl.contains("https://www.gsmarena.com/"));
		
        List<WebElement> PhoneFinder=driver.findElements(By.cssSelector("body>*:nth-child(7) aside ul>li>a"));
		
		for (int i=0;i<PhoneFinder.size();i++) {
			System.out.println(PhoneFinder.get(i).getText()+" : ");
			
		}
		Thread.sleep(1000);
		driver.close();

		
	}

}
