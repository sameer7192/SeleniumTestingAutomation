package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMouse1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
		Actions Mouse= new Actions(driver);
		
		List<WebElement> mainMenu= driver.findElements(By.xpath("//div[@class=\"InyRMC _3Il5oO\"]/div/div/a"));
		System.out.println("Main Menu option count: " + mainMenu.size());
		
		for (int i=0; i<mainMenu.size();i++) {
			WebElement MenuOption= mainMenu.get(i);
			Mouse.moveToElement(MenuOption).perform();
			Thread.sleep(2000);
			System.out.println("Main menu option is : "+mainMenu.get(i).getText());
		}
		
		
		

	}

}
////div[@class="InyRMC _3Il5oO"][div[div[5]]]
////div[@class=\"_37M3Pb\"][div[a[div[div[img[@alt=\"Top Offers\"]]]]]]