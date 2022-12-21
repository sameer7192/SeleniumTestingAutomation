package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricInfoMouse1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.espncricinfo.com/");
		Actions act=new Actions(driver);
		
		List<WebElement> mainMenu= driver.findElements(By.xpath("//div[@class=\"ds-flex ds-flex-row\"]/div/a"));
		System.out.println("Main menu count : "+mainMenu.size());
		
		for (int i=0; i<mainMenu.size(); i++) {
			WebElement menuOption=mainMenu.get(i);
			act.moveToElement(menuOption).perform();
			Thread.sleep(1000);
			System.out.println("main menu option is : "+mainMenu.get(i).getText());
		}
		List<WebElement> Option1= driver.findElements(By.cssSelector("a[href=\"/live-cricket-score\"]"));
		for (int i=0; i<Option1.size(); i++) {
			WebElement LiveScoreOption=Option1.get(i);
			act.moveToElement(LiveScoreOption).perform();
			Thread.sleep(1000);
			System.out.println("Live Score options are : "+Option1.get(i).getText());
			
		}

	}

}
