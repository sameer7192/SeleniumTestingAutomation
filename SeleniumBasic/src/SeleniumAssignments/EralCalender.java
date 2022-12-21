package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class EralCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://etrain.info/in");
		//a[class='ui-state-hover'
		driver.findElement(By.id("tbsfi1")).sendKeys("mumbai");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[id='suggest_row3'] i[class='icon-train-tunneled']")).click();
		
		driver.findElement(By.id("tbsfi3")).sendKeys("pune");
//		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='suggest_row1']")).click();
		driver.findElement(By.id("tbsfi4")).click();
		
		driver.findElement(By.cssSelector("input[class='nav']")).click();
		driver.findElement(By.cssSelector("input[value=\"13\"]")).click();
		
		driver.findElement(By.id("tbsfi5")).sendKeys("Tatkal");
		driver.findElement(By.id("tbssbmtbtn")).click();
		
		List<WebElement> SuperFastExpressTrainName= driver.findElements(By.cssSelector("a[class='sf pdl3']"));
		
		for (int i=0; i<SuperFastExpressTrainName.size(); i++) {
			System.out.println(SuperFastExpressTrainName.get(i).getText()+": "+SuperFastExpressTrainName.get(i).getText());
		}
		
//		List<WebElement> ExpressTrainName= driver.findElements(By.cssSelector("a[class=exp pdl3]"));
//		
//		for (int i=0; i<ExpressTrainName.size(); i++) {
//			System.out.println(ExpressTrainName.get(i).getText()+": "+ExpressTrainName.get(i).getText());
//		}
	

	}

}
