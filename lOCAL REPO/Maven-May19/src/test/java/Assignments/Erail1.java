package Assignments;

import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavenUtilities.SeleniumUtility;

public class Erail1 {

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://erail.in/");
		String homePageWinId = driver.getWindowHandle();//T1
		System.out.println("Home page window ID: " + homePageWinId);
		
		driver.findElement(By.xpath("//a[text()='eCatering']")).click();
		Set<String> allWinIds = driver.getWindowHandles();
		System.out.println("All windows ID: " + allWinIds);
		allWinIds.remove(homePageWinId);//T2
		System.out.println("After remoing homeWinID, all windows ID: " + allWinIds);

		// get child window id using iterator
		driver.switchTo().window(allWinIds.iterator().next());
		
		driver.findElement(By.cssSelector("input[placeholder=\"Search Train or Station to explore\"]")).click();
		driver.findElement(By.cssSelector("input[class=\"form-input pl-10  text-sm\"]")).sendKeys("22160");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"body-3 text-gray-60 h-10 px-4 w-full text-left leading-relaxed \"]")).click();
		driver.findElement(By.cssSelector("input[name=\"date\"]")).click();
		
		for(int i=0; i<4; i++) {
			driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN);
		}
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("select[placeholder='Boarding Station']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[placeholder='Boarding Station']")).sendKeys("Thane", Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='FIND FOOD']")).click();
		
		List<WebElement> hotelName=driver.findElements(By.xpath("//div[@class=\"w-2/3 pl-6 flex flex-col gap-4 pt-10 pb-24\"]/div/div[2]/div/h5"));
		for (int i=0; i<hotelName.size(); i++) {
					
		System.out.println("hotel name at Thane station are: "+hotelName.get(i).getText());
		
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='C SHIVAJI MAH T']")).click();;
		
		List<WebElement> cstHotelName=driver.findElements(By.cssSelector("h5[class='tracking-normal ']"));
		
		for (int i=0; i<cstHotelName.size();i++) {
			System.out.println("hotel name at CST station are: "+cstHotelName.get(i).getText());
			
		}
		
		}
		

	}


