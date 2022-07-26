package Test;

import org.testng.annotations.Test;

public class foutrh {

	@Test
	public static void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHome");
	}
	
	@Test(groups= {"Smoke"})
	public static void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test
	public static void APILoginHomeLoan()
	{
		System.out.println("APILoginHome");
	}
	
	@org.testng.annotations.AfterTest
	public static void AfterTest()
	{
		System.out.println("Execute After test");
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("Execute After suite");
	}
	
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Execute before each and every method of class");
	}
	
}
