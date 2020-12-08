package testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcase execution passed");
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Testcase execution failed");
		System.out.println(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Testcase execution skipped");
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		    onTestFailure(result);
	}

	@Override
	public void onStart(ITestContext context)
	{
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		
	}

}

