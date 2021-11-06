package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
private WebDriver driver;
	
	@FindBy (xpath="//div[@id='ext-comp-1016']")
	private WebElement crteTask;
	
	@FindBy (xpath="//div[@class='close-button']")
	private WebElement closee;
	
	public TaskPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickTask()
	{
		crteTask.click();
	}

	 public void closeb()
	 {
		 closee.click(); 
	 }

}
