package Com.takeScreenShotfromError;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {

		ITestListener.super.onTestFailure(result);
        System.out.println("Error accured");
		try {
			screenMethod(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
} 