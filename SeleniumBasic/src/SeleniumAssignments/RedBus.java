package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		//String chromeExePath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		//setting the path for driver executable
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", chromeExePath);
		//creating an instance of Chrome browser and up-casting it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("input[id='src']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("ul>*:nth-child(2)>i[class='icon solr-icon icon-ic-area']")).click();
		
		driver.findElement(By.cssSelector("input[data-message='Please enter a destination city']")).sendKeys("Mumbai");
		driver.findElement(By.cssSelector("ul>*:nth-child(3)>i[class='icon solr-icon icon-ic-area']")).click();
		
		driver.findElement(By.cssSelector(".rb-monthTable td[class='next']")).click();
		driver.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-child(4)>*:nth-child(6)")).click();
		
		driver.findElement(By.id("search_btn")).click();
		driver.findElement(By.cssSelector("ul[class='list-chkbox']>*:nth-child(3) label[class='custom-checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul[class='list-chkbox']>*:nth-child(2) label[for='bt_SLEEPER']")).click();
		driver.findElement(By.cssSelector("label[for='dtAfter 6 pm']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("li[class='checkbox'] label[title='Single Seats']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul[class='dept-time at-time-filter']>*:nth-child(1)>*:nth-child(4)")).click();
		
		List<WebElement> BusName= driver.findElements(By.cssSelector("div[class='travels lh-24 f-bold d-color']"));
		List<WebElement> BusFare= driver.findElements(By.cssSelector("div[class='fare d-block']"));
		
		for (int i=0; i<BusName.size(); i++) {
			System.out.println(BusName.get(i).getText()+" : "+BusFare.get(i).getText());
		}
		
		//label[for="atBefore 6 am"]
				
		//driver.findElement(By.cssSelector("li[id='21880570'] div[class='button view-seats fr']")).click();
	}

}