package Test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class second {

	@Test(dataProvider="data")
	public static void secondDemo1(String username,String password)
	{
		System.out.println("secondDemo1");
		System.out.println(username);
		System.out.println(password);
	}

	@Parameters({"URL","username"})
	@Test
	public  void demon(String urlname,String username)
	{
		System.out.println(urlname);
		Assert.assertTrue(true);
		System.out.println(username);
		
	}
	
	@DataProvider
	public Object[][] data()
	{
		Object[][] data = new Object[2][2];
		data[0][0]="pratik";
		data[0][1]="pk33";
		
		data[1][0]="sumit";
		data[1][1]="su33";
		
		return data;
	}
}
