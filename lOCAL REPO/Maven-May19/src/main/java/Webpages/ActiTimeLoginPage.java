package Webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mavenUtilities.SeleniumUtility;

public class ActiTimeLoginPage extends SeleniumUtility {
		WebDriver driver;
	public ActiTimeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[name=\"username\"]")
	WebElement usernameInput;
	
	@FindBy(css="input[name=\"pwd\"]")
	WebElement passwordInput;
	
	@FindBy(css="#loginButtonContainer>#loginButton")
	WebElement loginButton;
	
	@FindBy(id="container_tasks")
	WebElement taskLogo;
	
	@FindBy(css="div[class=\"title ellipsis\"]")
	WebElement addNew;
	
	@FindBy(css="div[class=\"item createNewTasks\"]")
	WebElement newTask;
	
	@FindBy(xpath="//div[@class=\"customerSelector customerOrProjectSelector selectorWithPlaceholderContainer\"]/div/div/div")
	WebElement alreadySelectedCustomer;
	
	@FindBy(xpath="//div[@class=\"searchItemList\"]/div[text()=\"Big Bang Company\"]")
	WebElement selectCustomer;
	
	@FindBy(css=".projectSelector .selectedItem")
	WebElement projectInputField;
	
	@FindBy(xpath="//div[@class=\"searchItemList\"]/div[text()=\"Spaceship testing\"]")
	WebElement selectProject;
	
	@FindBy(xpath="//input[@placeholder=\"Enter task name\"]")
	WebElement enterTaskName;
	
	@FindBy(xpath="//div[text()=\"Create Tasks\"]")
	WebElement createTask;
	
	@FindBy(xpath="//div[text()='Automation Test Engineer']")
	WebElement checkTask;
	
	@FindBy(xpath="//div[@class=\"tasksTablesWrapper\"]/div[@class=\"createdTasksTableContainer\"]/table/tbody/tr/td/div/div[@class=\"img\"]")
	WebElement checkBox;
	
	@FindBy(xpath="//div[@class=\"delete button\"]")
	WebElement deleteLogo;
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	WebElement deletePermanently;
	
	public void enterUsername() {
		typeInput(usernameInput, "admin");
	}
	
	public void enterPassword() {
		typeInput(passwordInput, "manager");
	}
	
	public void clickOnLoginButton() {
		clickOnElement(loginButton);
	}
	
	public void clickOnTaskIcon() {
		clickOnElement(taskLogo);
	}
	
	public void clickOnAddNewTask() {
		clickOnElement(addNew);
	}
	
	public void clickOnNewTask() {
		clickOnElement(newTask);
	}
	
	public void clickOnCustomer() {
		clickOnElement(alreadySelectedCustomer);
	}
	
	public void selectCustomer() {
		clickOnElement(selectCustomer);
	}
	
	public void selectOnProjectField() {
		clickOnElement(projectInputField);
	}
	
	public void selectProject() {
		clickOnElement(selectProject);
	}
	
	public void enterTaskName() {
		typeInput(enterTaskName, "Automation Test Engineer");
	}
	
	public void clickOnCreateTask() {
		clickOnElement(createTask);
	}
	
	public void checkTaskCreation() {
		checkTask.isDisplayed();
	}
	
	public void selectCheckBox() {
		clickOnElement(checkBox);
	}
	
	public void clickOnDeleteLogo() {
		clickOnElement(deleteLogo);
	}
	
	public void clickOnDeletePermanently() {
		clickOnElement(deletePermanently);
	}
	
	public void checkTaskDeleted() {
		isElementExist(checkTask);
	}
}
