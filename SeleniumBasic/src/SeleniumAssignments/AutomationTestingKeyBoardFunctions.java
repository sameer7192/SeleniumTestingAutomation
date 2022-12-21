package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingKeyBoardFunctions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		WebElement FirstName=driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		//first name
		FirstName.sendKeys("Sameer", Keys.TAB);
		//last name
		driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]")).sendKeys("Bude", Keys.TAB);
		Thread.sleep(2000);
		//address
		driver.findElement(By.cssSelector("textarea[class=\"form-control ng-pristine ng-untouched ng-valid\"]")).sendKeys("Badlapur", Keys.TAB);
		//emailid
		driver.findElement(By.cssSelector("input[type=\"email\"]")).sendKeys("sameerbude12@gmail.com", Keys.TAB);
		//telephonr no
		driver.findElement(By.cssSelector("input[type=\"tel\"]")).sendKeys("9130186316", Keys.TAB);
		//gender
		driver.findElement(By.cssSelector("input[value=\"Male\"]")).sendKeys(Keys.SPACE, Keys.TAB);
		//hobbies
		driver.findElement(By.id("checkbox1")).sendKeys(Keys.SPACE);
	
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		//language
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//body")).click();
		//Thread.sleep(2000);
		//skills
		driver.findElement(By.id("Skills")).sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
		driver.findElement(By.xpath("//select[@id=\"Skills\"]/option[28]")).click();
		
		//country
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("span[class=\"select2-selection__arrow\"]"))));
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"select2-selection__arrow\"]")).click();
		driver.findElement(By.xpath("//span[@class=\"select2-results\"]/ul/li[6]")).click();
				
		driver.findElement(By.id("yearbox")).sendKeys("1992");
		driver.findElement(By.cssSelector("select[placeholder=\"Month\"]")).sendKeys("January");
		driver.findElement(By.id("daybox")).sendKeys("7");
		//password
		driver.findElement(By.id("firstpassword")).sendKeys("Sameer@123", Keys.TAB);
		driver.findElement(By.id("secondpassword")).sendKeys("Sameer@123", Keys.TAB);
		driver.findElement(By.id("submitbtn")).click();
		
				
		

	}

}
