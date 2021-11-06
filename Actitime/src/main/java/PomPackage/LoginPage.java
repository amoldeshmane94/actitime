package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	@FindBy (xpath="//input[@name='username']")
	private WebElement usenmae;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement login;
	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName()
	{
		usenmae.sendKeys("admin");
	}
	public void sendpassword()
	{
		password.sendKeys("manager");
	}
	public void clickonlogin()
	{
	login.click();
	}
	
//	public void loginActTime()
//	{
//		usenmae.sendKeys("admin");
//		password.sendKeys("manager");
//		login.click();
//	}
	
	

}
