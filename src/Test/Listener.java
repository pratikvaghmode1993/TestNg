package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	  public  void onTestSuccess(ITestResult result) {
		   
		  }
	  
	  public  void onTestFailure(ITestResult result) {
		    System.out.println("I am failed"+result.getName());
		  }

}
