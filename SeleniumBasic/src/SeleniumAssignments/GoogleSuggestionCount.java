package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestionCount {

	public static void main(String[] args) throws InterruptedException {
		String currentWorkingDir= System.getProperty("user.dir");
		String ChromePath= currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.className("gLFyf")).sendKeys("fifa");
		Thread.sleep(2000);
		
		List<WebElement> suggestions= driver.findElements(By.cssSelector("ul>li span>b"));
		
		for (int i=0; i<suggestions.size();i++) {
			System.out.println(suggestions.get(i).getText()+": ");
			
		}
		
		
	}

}
