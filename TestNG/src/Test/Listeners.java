package Test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNG listeners 

public class Listeners implements ITestListener{
     
	@Override
	public void onTestStart(ITestResult result) {
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Successfully executed listeners");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		//screenshot code when test is failed
		//response if API is failed
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
}
