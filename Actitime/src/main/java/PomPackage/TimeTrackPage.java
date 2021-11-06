package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {
	
private WebDriver driver;
	
	@FindBy (xpath="//input[@class='taskSearchField']")
	private WebElement serch;
	
	@FindBy (xpath="//span[text()='Add Recent Task']")
	private WebElement AddRecentTask;
	
	@FindBy (xpath="(//div[@class=\"row task\"])[3]")
	private WebElement FinalDesign;
	
	public TimeTrackPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void serchclick()
	{
		serch.sendKeys("velocity");
	}
	public void addrecent()
	{
		AddRecentTask.click();
		FinalDesign.click();
	}


}
