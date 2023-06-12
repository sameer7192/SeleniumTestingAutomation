package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import mavenUtilities.SeleniumUtility;

public class ActitimeTaskPage extends SeleniumUtility{
	WebDriver driver;
	public ActitimeTaskPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="container_tasks")
	private WebElement GoToTask;
	
	@FindBy (css="div[class='title ellipsis']")
	private WebElement ClickOnAddNewTask;
	
	@FindBy(css = "div[class=\"item createNewTasks\"]")
	private WebElement CreateNewTask;
	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div/div/div")
	private WebElement SelectedCustomer;
	
	@FindBy(xpath="//div[@class=\"searchItemList\"]/div[text()=\"Big Bang Company\"]")
	private WebElement SelectNewCustomer;
	
	@FindBy(css=".projectSelector .selectedItem")
	private WebElement projectInputField;
	
	@FindBy(xpath="//div[@class=\"searchItemList\"]/div[text()=\"Spaceship testing\"]")
	private WebElement selectProject;
	
	@FindBy(xpath = "//td[@class='nameCell first']/input[@class='inputFieldWithPlaceholder']")
	private WebElement AddTaskName;
	
	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement ClickOnCreateTastButton;
	
	@FindBy(xpath="//div[text()='Automation Test Engineer']")
	private WebElement checkTask;
	
	@FindBy(xpath = "//div[@class='tasksTablesWrapper']/div[@class='createdTasksTableContainer']/table/tbody/tr/td/div/div[@class='img']")
	private WebElement SelectCreatedTask;
	
	@FindBy(xpath = "//div[@class='delete button']")
	private WebElement clickOnDeleteButton;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement ConfirmDeleteTask;
	
	
	public void navigateToTaskPage() {
		clickOnElement(GoToTask);
		
	}
	public void createNewTask(String Tname) {
		clickOnElement(ClickOnAddNewTask);
		clickOnElement(CreateNewTask);
		clickOnElement(SelectedCustomer);
		clickOnElement(SelectNewCustomer);
		clickOnElement(projectInputField);
		clickOnElement(selectProject);
		typeInput(AddTaskName, Tname);
		clickOnElement(ClickOnCreateTastButton);
		
	}
		
	public void DeleteTask() {
		clickOnElement(SelectCreatedTask);
		clickOnElement(clickOnDeleteButton);
		clickOnElement(ConfirmDeleteTask);
	}
	
}