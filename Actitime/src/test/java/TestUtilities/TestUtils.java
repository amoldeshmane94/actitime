package TestUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TestUtils {
	
	//screenshot code
	
	public static void takeScreenhot(WebDriver driver , int testID) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("test-output\\testScreenshots\\Test_"+testID+"Date and Time"+".jpg");
		FileHandler.copy(source, dest);
		
	}

}
