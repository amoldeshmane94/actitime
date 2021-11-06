package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	
	public static WebDriver openChromeBrower()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\new\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver openFireFoxBrower()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\QA\\new\\geckodriver-v0.30.0-win32 (1)\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}

}
