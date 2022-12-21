package SeleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
		
		driver.findElement(By.xpath("//span[text()='OnePlus 10T 5G (Moonstone Black, 16GB RAM, 256GB Storage)- Additional Exchange Offer INR 10,000 on iOS & OP Users']")).click();
		WebElement MobileName= driver.findElement(By.xpath("//span[text()='OnePlus 10T 5G (Moonstone Black, 16GB RAM, 256GB Storage)- Additional Exchange Offer INR 10,000 on iOS & OP Users']"));
		WebElement MobilePrice= driver.findElement(By.xpath("//div[div[h2[a[span[text()='OnePlus 10T 5G (Moonstone Black, 16GB RAM, 256GB Storage)- Additional Exchange Offer INR 10,000 on iOS & OP Users']]]]]/div[3]/div/a/span/span/span[2]"));
		
		System.out.println("Mobile Name is : "+MobileName.getText());
		System.out.println("Mobile price is : "+MobilePrice.getText());
	
	
	}

}
