package Day4.CssSelector;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWidgets {

	public static void main(String[] args) {
		String chromeExePath = System.getProperty("user.dir") + "\\Executables\\chromedriver.exe";
		// setting the path for driver executable
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		// creating an instance of Chrome browser and up-casting it to WebDriver
		// interface
		WebDriver driver = new ChromeDriver();
		// maximize browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to enter required application URL use get() of WebDriver interface
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		// click on signin button
		driver.findElement(By.cssSelector(".buttonBlue")).click();
		
		// click on Widget button
		driver.findElement(By.cssSelector(".addButton")).click();
		// select History
		driver.findElement(By.cssSelector("a[data-name='History']")).click();

		// click on Widget button
		driver.findElement(By.cssSelector(".addButton")).click();
		// select History
		driver.findElement(By.cssSelector("a[data-name='TotalRevenuePerSalesPerson']")).click();

		// click on Widget button
		driver.findElement(By.cssSelector(".addButton")).click();
		// select History
		driver.findElement(By.cssSelector("a[data-name='TopPotentials']")).click();
		
		//click on user profile
		driver.findElement(By.cssSelector(".userName")).click();
		driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();
	}
}