package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		Actions act=new Actions(driver);
		WebElement sourceElement= driver.findElement(By.xpath("//div[@id=\"columns\"]/div[1]"));
		WebElement targetElement= driver.findElement(By.xpath("//div[@id=\"columns\"]/div[2]"));
		Thread.sleep(2000);
		act.dragAndDrop(sourceElement, targetElement).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(targetElement, sourceElement).build().perform();

	}

}
