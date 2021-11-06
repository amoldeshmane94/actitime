package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BasePackage.Base;
import PomPackage.HomePage;
import PomPackage.LoginPage;
import PomPackage.ReportPage;
import PomPackage.TaskPage;
import PomPackage.TimeTrackPage;

public class TestClass2 extends Base {
	WebDriver driver;
	LoginPage login;
	HomePage home;
	ReportPage report;
	TaskPage task;
	TimeTrackPage timetrack;
	
	@BeforeTest
	@Parameters("browser")
	
	public void test11(String browser)
	{
		 if (browser.equalsIgnoreCase("chrome"))
         {
         	driver=openChromeBrower();
         }
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://localhost/user/submit_tt.do");
	}
	
	


	@BeforeClass
	public void cls()
	{
		 login=new LoginPage(driver);
		  home=new HomePage(driver);
		  report=new ReportPage(driver);
		  task=new TaskPage(driver);
		  timetrack=new TimeTrackPage(driver);
	}
	@BeforeMethod
	public void method() throws InterruptedException 
	{
		login.sendUserName();
		login.sendpassword();
		login.clickonlogin();
		Thread.sleep(5000);
	}
	@Test
	public void test11() throws InterruptedException
	{
		home.opentask();
		String url=driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(4000);
			task.clickTask();
			Thread.sleep(4000);
			task.closeb();
			Thread.sleep(4000);
			
	}
   @Test
   public void test12() throws InterruptedException
   {
	   home.opentimeTrack();
	   Thread.sleep(4000);
	   timetrack.serchclick();
	   Thread.sleep(4000);
	   timetrack.addrecent();
	   
   }
   @AfterMethod
   public void method1() throws InterruptedException
   {
	   home.logot();
		Thread.sleep(5000);
   }
	
   @AfterClass
	public void class11()
	{
		login=null;
		home=null;
	}
	
	@AfterTest
	public void test22()
	{
		driver.close();
		driver=null;
		System.gc();//All object will kill
	}
	
	
	
	

}
