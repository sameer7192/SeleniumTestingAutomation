package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPagination {

	public static void main(String[] args) throws InterruptedException {
		String ChromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromeExePath );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
			
		String homePageTitle= driver.getTitle();
		String expectedHomePageTitle = ("GSMArena.com - mobile phone reviews, news, specifications and more...");
		System.out.println("page title: "+homePageTitle);
		System.out.println("Page title validation : "+homePageTitle.equals(expectedHomePageTitle));
		
		
		WebElement SamsungPage=driver.findElement(By.cssSelector("a[href=\'samsung-phones-9.php\']"));
		SamsungPage.click();
		Thread.sleep(2000);
		WebElement NextPageOption=driver.findElement(By.cssSelector("div[class='nav-pages']"));
		System.out.println("is pagination displated: "+NextPageOption.isDisplayed());
		
		
		//List<WebElement> Pagination= NextPageOption.findElements(By.cssSelector("*:nth-child(5) *:nth-child(2) *:nth-child(4)>div>a"));
	
		
	}}

