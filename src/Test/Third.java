package Test;

import org.testng.annotations.Test;

public class Third {

	@Test
	public static void WebLoginCarLoan()
	{
		System.out.println("WebLoginCar");
	}
	
	@Test(dependsOnMethods= {"MobileSignCarLoan"})
	public static void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCar");
	}
	
	@Test(enabled=false)
	public static void APILoginCarLoan()
	{
		System.out.println("APILoginCar");
	}
	@Test
	public static void MobileSignCarLoan()
	{
		System.out.println("MobileSignInCar");
	}
	@Test
	public static void MobileSignOutCarLoan()
	{
		System.out.println("MobileSignOutInCar");
	}
	@Test
	public static void MobileSignOutCarLoan_()
	{
		System.out.println("MobileSignOutInCar");
	}
}
