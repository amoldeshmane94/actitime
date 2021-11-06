package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {
	
private WebDriver driver;
	
	@FindBy (xpath="//div[@id='ext-comp-1011']")
	private WebElement btn;
	
//	@FindBy (xpath="//div[@id='reportName_4']")
//	private WebElement overtime;
//	
//
//	@FindBy (xpath="(//td[@class='close-button'])[2]")
//	private RemoteWebElement close;
//	
//	
	public ReportPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickbtn1()
	{
		btn.click();
	}

//	public void click_overtime()
//	{
//		overtime.click();
//	}
//	
//	public void close()
//	{
//		close.click();
//	}
//}

}
