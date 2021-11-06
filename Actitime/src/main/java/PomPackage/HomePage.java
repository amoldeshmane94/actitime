package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
private WebDriver driver;
	
	@FindBy (xpath="(//td[@class='navItem relative'])[1]")
	private WebElement timeTrack;
	
	@FindBy (xpath="(//td[@class='navItem relative'])[2]")
	private WebElement task;
	
	@FindBy (xpath="(//td[@class='navItem relative'])[3]")
	private WebElement report;
	
	@FindBy(xpath="(//td[@class='navItem relative'])[4]")
	private WebElement Users;
	
	@FindBy (xpath="(//td[@class='navItem relative'])[5]")
	private WebElement work_scdeule;
	
	@FindBy (xpath="//td[@class='logoutCell']")
	private WebElement logout;
	
	
	public HomePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void opentimeTrack()
	{
		timeTrack.click();
	}
	
	public void opentask()
	{
		task.click();
	}
	
	public void openreport()
	{
		report.click();
	}
	
	public void openuser()
	{
		Users.click();
	}

	public void openworkscedule()
	{
		work_scdeule.click();
	}

	public void logot()
	{
		logout.click();
	}
}
