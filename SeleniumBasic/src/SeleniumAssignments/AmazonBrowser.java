package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowser {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir= System.getProperty("user.dir");
		String ChromePath= currentWorkingDir+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(600,1000));
				
		driver.manage().window().maximize();
		
		String HomePageTitle= driver.getTitle();
		
		System.out.println("Home page title is : "+HomePageTitle);
		
		driver.findElement(By.cssSelector("a[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
		
		String MobilePageTitle= driver.getTitle();
		
		System.out.println("Mobile page title is : "+MobilePageTitle);
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		String HomePageTitle2 = driver.getTitle();
		System.out.println("Home page title is : "+HomePageTitle2);
		
		System.out.println("Home page title validation : "+HomePageTitle.equals(HomePageTitle2));
		
		
		


	}

}
