package testng_group;

import org.testng.annotations.Test;

public class test2 {
	
	@Test(groups = {"smoke", "sanity"})
	public void test11()
	{
		System.out.println("Test11 pass");
	}
	@Test(groups = {"regression"})
	public void test12()
	{
		System.out.println("Test12 pass");
	}
	@Test(groups = {"smoke", "regression"})
	public void test13()
	{
		System.out.println("Test13 pass");
	}
	@Test(groups = {"smoke"})
	public void test14()
	{
		System.out.println("Test14 pass");
	}
	@Test
	public void test15()
	{
		System.out.println("Test15 pass");
	}


}
