package Listenerss;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Data implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{

System.out.println("tc is passed");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("tc failed capture ss");
	}

	@Override
	public void onTestSkipped(ITestResult result) {

System.out.println("tc skipped");
	}
	
	

}
