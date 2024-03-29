package DataDrivenTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mavenUtilities.ExcelUtility;
import mavenUtilities.SeleniumUtility;


public class ActitimeLogin extends SeleniumUtility{
	
	String appUrl;
	String userName;
	String password;
	
	@BeforeTest
	public void getData() {
		appUrl=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 1, 0);
		userName=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 1, 1);
		password=ExcelUtility.getCellValue(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 1, 2);
	}

	@Test
	public void actitimeLogin() {
			WebDriver driver=setUp("chrome", appUrl);			
			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Assert.assertEquals(getCurrentTitleOfApplication(), "actiTIME - Login");
			ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 2, 3,"Failed");
	}
	@AfterTest
	public void cleanUp() {
		ExcelUtility.updateExcelContent(".\\src\\test\\resources\\AppData\\AppTestData.xlsx", "sheet1", 2, 3,"Passed");
		//teardown();
	}
}
