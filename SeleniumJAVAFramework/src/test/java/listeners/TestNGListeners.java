package listeners;

import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener, ISuiteListener {

	public void onTestStart(ITestResult result) {
		System.out.println("****** Test started :"+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("****** Test is successful :"+result.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("****** Test skipped :"+result.getName());
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		System.out.println("****** Test failed :"+result.getName());
	}
	
	public void onStart(ITestContext context) {
//		System.out.println("****** Test failed :"+result.getName());
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("****** Tests completed :"+context.getName());
	}
	
	
}
