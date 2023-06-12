package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavenUtilities.SeleniumUtility;

public class Jquery1 {

	public static void main(String[] args) {
		SeleniumUtility s1= new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://jqueryui.com/");
		
		WebElement frame=driver.findElement(By.cssSelector("a[href=\"http://jqueryui.com/sortable/\"]"));
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		driver.switchTo().frame(0);
		
		WebElement source= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[7]"));
		WebElement target= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[1]"));
		SeleniumUtility.action.dragAndDrop( source, target).perform();

		WebElement source1= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[7]"));
		WebElement target1= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[2]"));
		SeleniumUtility.action.dragAndDrop( source1, target1).perform();
		
		WebElement source2= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[7]"));
		WebElement target2= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[3]"));
		SeleniumUtility.action.dragAndDrop( source2, target2).perform();
		
		WebElement source3= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[7]"));
		WebElement target3= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[4]"));
		SeleniumUtility.action.dragAndDrop( source3, target3).perform();
		
		WebElement source4= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[7]"));
		WebElement target4= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[5]"));
		SeleniumUtility.action.dragAndDrop( source4, target4).perform();
		
		WebElement source5= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[7]"));
		WebElement target5= driver.findElement(By.xpath("//ul[@id=\"sortable\"]/li[6]"));
		SeleniumUtility.action.dragAndDrop( source5, target5).perform();
		
//		WebElement source= driver.findElement(By.xpath("//li[text()='Item 7']"));
//		WebElement target= driver.findElement(By.xpath("//li[text()='Item 1']"));
//		SeleniumUtility.action.dragAndDrop( source, target).perform();
		
		
		
		
		
		
		
		
	}

}


