package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaMobile {

	public static void main(String[] args) {
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
		
		driver.findElement(By.cssSelector("a[href=\'samsung-phones-9.php\']")).click();
		
		List <WebElement> SamsungPhones=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
		
		for (int i=0;i<SamsungPhones.size();i++) {
			System.out.println(SamsungPhones.get(i).getText()+" : ");
			
		}
		
		driver.close();
		
	}

}
