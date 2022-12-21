package SeleniumAssignments;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1_Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Actions A1= new Actions(driver);
		
		
//		for (int i=0; i<mainMenu.size();i++) {
//			WebElement menuOptions=mainMenu.get(i);
//			System.out.println("Main menu options are : "+mainMenu.get(i).getText());
//			System.out.println("main menu size is : "+mainMenu.size());
//			A1.moveToElement(menuOptions).perform();
//			
//		}
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//html")).sendKeys(Keys.F5);
		
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()=\\\"Mobiles\\\"]"))));
		driver.findElement(By.xpath("//a[text()=\"Mobiles\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"s-refinements\"]/div[5]/ul/li/span/a/div")).click();
		driver.findElement(By.xpath("//div/div/h2/a/span[text()='Redmi A1 (Light Blue, 2GB RAM, 32GB Storage) | Segment Best AI Dual Cam | 5000mAh Battery | Leather Texture Design | Android 12']")).click();
		
		TakesScreenshot SS= (TakesScreenshot)driver;
		File screenshot=SS.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".\\Screenshots\\AmazonRedmiMobileScreenshot.png"));
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id=\"nav-logo\"]")).click();
		
		List<WebElement> mainMenu= driver.findElements(By.xpath("//div[@id=\"nav-main\"]/div[2]/div/div/a"));	
		for (int i=0; i<mainMenu.size();i++) {
			WebElement menuOptions=mainMenu.get(i);
			System.out.println("Main menu options are : "+mainMenu.get(i).getText());
			System.out.println("main menu size is : "+mainMenu.size());
			A1.moveToElement(menuOptions).perform();
			
		}
	}

}
