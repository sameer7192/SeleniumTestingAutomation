package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechlisticBrowser {

	public static void main(String[] args) throws InterruptedException {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String homePageTitle= driver.getTitle();
		driver.findElement(By.cssSelector("a[href=\'https://www.techlistic.com/p/java.html']")).click();
		String javaPageTitle = driver.getTitle();
		System.out.println("page title: "+javaPageTitle);
		System.out.println("Page title validation : "+homePageTitle.equals(javaPageTitle));
		driver.navigate().back();
		Thread.sleep(2000);
		
		String homePageTitle2= driver.getTitle();
		System.out.println("page title: "+homePageTitle2);
		driver.findElement(By.cssSelector("a[href=\'https://www.techlistic.com/p/selenium-tutorials.html\']"));
		String seleniumPageTitle = driver.getTitle();
		System.out.println("Page2 title validation : "+homePageTitle2.equals(seleniumPageTitle));
		driver.navigate().back();
		Thread.sleep(2000);
		
		String homePageTitle3= driver.getTitle();
		System.out.println("page title: "+homePageTitle3);
		driver.findElement(By.cssSelector("a[href=\'https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html\']"));
		String BDDPageTitle = driver.getTitle();
		System.out.println("Page2 title validation : "+homePageTitle2.equals(BDDPageTitle));
		driver.navigate().back();
		Thread.sleep(2000);
		
		String homePageTitle4= driver.getTitle();
		System.out.println("page title: "+homePageTitle4);
		driver.findElement(By.cssSelector("a[href=\'https://www.techlistic.com/p/software-testing.html\']"));
		String testingPageTitle = driver.getTitle();
		System.out.println("Page2 title validation : "+homePageTitle2.equals(testingPageTitle));
		driver.navigate().back();
		Thread.sleep(2000);
		
		String homePageTitle5= driver.getTitle();
		System.out.println("page title: "+homePageTitle5);
		
	}

}
