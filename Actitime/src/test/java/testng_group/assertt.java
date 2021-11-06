package testng_group;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertt {
	
//	@Test
//	public void demo1()
//	{
//		String url="www.facebook.com";
//		
//		//Assert.assertEquals(url, "facebook", "wrong url mension");
//		//Assert.assertNotEquals(url,"facebook");
//		//Assert.assertTrue(url.equalsIgnoreCase("raj"));
//		//Assert.assertFalse(url.equalsIgnoreCase("raj"));
//		Assert.fail();
//		System.out.println("hiii");
//	}
//	
	
	@Test
	public void demo2()
	{
		String url="www.instagram.in";
		
		SoftAssert soft = new SoftAssert();
		
		//soft.assertNotEquals(url, "fb");
		//soft.assertEquals(url, "fb");
		//soft.assertTrue(url.equalsIgnoreCase("raj"));
		//soft.assertFalse(url.equalsIgnoreCase("raj"));
		//soft.assertAll();
	}
	

	
	
	
	
	
	
	
	
}
