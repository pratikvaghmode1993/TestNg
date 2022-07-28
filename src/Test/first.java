package Test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class first {

	
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("Execute before all method of particular class");
	}
	@Test(groups= {"Smoke"})
	public static void Demo()
	{
		System.out.println("pratik");
	}
	
	@Parameters({"URL"})
	@Test
	public  void demon(String urlname)
	{
		System.out.println(urlname);
		Assert.assertTrue(false);
		
	}
	@org.testng.annotations.BeforeTest
	public static void BeforeTest()
	{
		System.out.println("Execute before test");
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("execute before suite:");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Execute before each and every method of class:");
	}
	
}
