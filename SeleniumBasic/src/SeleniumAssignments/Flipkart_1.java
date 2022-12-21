package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_1 {

	public static void main(String[] args) {
		String currentWorkingDir= System.getProperty("user.dir");
		String ChromePath= currentWorkingDir+"//Executables//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath );
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("button[class=\'_2KpZ6l _2doB4z\']")).click();
		List<WebElement> MainMenu=driver.findElements(By.cssSelector("body>div>div>*:nth-child(2) a>*:nth-child(2)"));
	
		
		for (int i=0; i<MainMenu.size();i++) {
			System.out.println(MainMenu.get(i).getText()+": ");
		}
		
		

	}

}
