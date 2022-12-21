package SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_1 {

	public static void main(String[] args) {
		String currentWorkingDir= System.getProperty("user.dir");
		String ChromePath= currentWorkingDir+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ChromePath);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		String HomePageUrl= driver.getCurrentUrl();
		String ExpectedHomePageUrl= ("https://www.facebook.com/");
		System.out.println("Home page url is : "+HomePageUrl);
		System.out.println("home page validation is : "+HomePageUrl.equals(ExpectedHomePageUrl));
		
		driver.findElement(By.cssSelector("a[class=\'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\']")).click();
		//date task
		WebElement birthDate=driver.findElement(By.name("birthday_day"));
		System.out.println(birthDate.isDisplayed());
		System.out.println(birthDate.isEnabled());
		System.out.println(birthDate.isSelected());
				
		List<WebElement> daycount= driver.findElements(By.cssSelector("select[id=\'day\']"));
		for (int i=0; i<daycount.size(); i++) {
			System.out.println(daycount.get(i).getText());
		}
	
		String birthdayName= birthDate.getAttribute("name");
		System.out.println("Name of day option is : "+birthdayName);
		
		WebElement DefaultValueOfDayOption= birthDate.findElement(By.cssSelector("option[value='13']"));
		System.out.println("default value of day is : "+DefaultValueOfDayOption.getText());
		birthDate.sendKeys("7");

		//month task
		WebElement monthDay=driver.findElement(By.name("birthday_month"));
		System.out.println(monthDay.isDisplayed());
		System.out.println(monthDay.isEnabled());
		System.out.println(monthDay.isSelected());
				
		List<WebElement> DayOfMonth= driver.findElements(By.cssSelector("select[id=\'month\']"));
		for (int i=0; i<DayOfMonth.size(); i++) {
			System.out.println(DayOfMonth.get(i).getText());
		}
	
		String Month= monthDay.getAttribute("name");
		System.out.println("Name of month option is : "+Month);
		
		WebElement DefaultValueOfmonthOption= monthDay.findElement(By.cssSelector("option[value='12']"));
		System.out.println("default value of month is : "+DefaultValueOfmonthOption.getText());
		monthDay.sendKeys("jan");
		
		//year task
		WebElement Year=driver.findElement(By.name("birthday_year"));
		System.out.println(Year.isDisplayed());
		System.out.println(Year.isEnabled());
		System.out.println(Year.isSelected());
				
		List<WebElement> Years= driver.findElements(By.cssSelector("select[id=\'year\']"));
		for (int i=0; i<Years.size(); i++) {
			System.out.println(Years.get(i).getText());
		}
	
		String YearName= Year.getAttribute("name");
		System.out.println("Name of year option is : "+YearName);
		
		WebElement DefaultValueOfYearOption= Year.findElement(By.cssSelector("option[value='2022']"));
		System.out.println("default value of year is : "+DefaultValueOfYearOption.getText());
		Year.sendKeys("1992");
		
		driver.close();
	}

	
}
