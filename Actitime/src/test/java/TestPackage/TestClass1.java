package TestPackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BasePackage.Base;
import PomPackage.HomePage;
import PomPackage.LoginPage;
import PomPackage.ReportPage;
import PomPackage.TaskPage;
import PomPackage.TimeTrackPage;
import TestUtilities.TestUtils;

public class TestClass1 extends Base {

	WebDriver driver;
	LoginPage login;
	HomePage home;
	ReportPage report;
	TaskPage task;
	int testID;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	TimeTrackPage timetrack;
	
	
	@BeforeSuite
	
	
	@BeforeTest
	@Parameters("browser")
	public void test(String browser)
	{
		reporter=new ExtentHtmlReporter("test-output"+File.separator+"extendReport"+File.separator+"Extent.html");
		ExtentReports extend=new ExtentReports();
		extend.attachReporter(reporter);
            if (browser.equalsIgnoreCase("chrome"))
            {
            	driver=openChromeBrower();
            }
            else if(browser.equalsIgnoreCase("firefox"))
            {
            	driver=openFireFoxBrower();
            }
		
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://localhost/user/submit_tt.do");
	}
	
	@BeforeClass
	public void class1()
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
	public void test1()
	{
		  testID=100;
		home.opentimeTrack();
		String url=driver.getCurrentUrl();
			System.out.println(url);
			Assert.assertNotEquals(url, "fb");
			
	}
	@Test
	public void test2()
	{
		  testID=200;
		home.opentask();
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
	}
	@AfterMethod
	public void method1(ITestResult result) throws InterruptedException, IOException
	{
		
		if(ITestResult.FAILURE==result.getStatus())
		{
			TestUtils.takeScreenhot(driver, testID);
		}
		home.logot();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public void class11()
	{
		login=null;
		System.out.println("login null");
		home=null;
	}
	
	@AfterTest
	public void test11()
	{
		driver.close();
		driver=null;
		System.gc();//All object will kill
	}
	
	@AfterSuite
	public void suut()
	{
		System.out.println("close suit");
	}
	

	
	

}
