package testng_group;

import org.testng.annotations.Test;

public class test1 {
	
	@Test(groups = {"smoke", "sanity"})
	public void test1()
	{
		System.out.println("Test1 pass");
	}
	@Test(groups = {"regression"})
	public void test2()
	{
		System.out.println("Test2 pass");
	}
	@Test(groups = {"smoke", "regression"})
	public void test3()
	{
		System.out.println("Test3 pass");
	}
	@Test(groups = {"smoke"})
	public void test4()
	{
		System.out.println("Test4 pass");
	}
	@Test
	public void test5()
	{
		System.out.println("Test5 pass");
	}

}
