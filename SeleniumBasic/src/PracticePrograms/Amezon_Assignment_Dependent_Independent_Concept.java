package PracticePrograms;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amezon_Assignment_Dependent_Independent_Concept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		// finding mobile
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']")).click();
		driver.findElement(By.xpath("//img[@alt=\"iQOO Neo 6\"]")).click();
		
		
		WebElement mobileName = driver.findElement(By.xpath("//div[div[div[1][h1[span[text() ='        iQOO 9 SE 5G (Sunset Sierra, 8GB RAM, 128GB Storage) | Qualcomm Snapdragon 888 | 66W Flash Charge       ']]]]]"));
		WebElement mobilePrice = driver.findElement(By.xpath("//div[div[div[1][h1[span[text() ='        iQOO 9 SE 5G (Sunset Sierra, 8GB RAM, 128GB Storage) | Qualcomm Snapdragon 888 | 66W Flash Charge       ']]]]]/div[10]/div[3]/div/span[2]/span[1]"));
		
		System.out.println("Mobile Name is : " + mobileName.getText());
		System.out.println("Mobile Price is : "+mobilePrice.getText());
	}
}