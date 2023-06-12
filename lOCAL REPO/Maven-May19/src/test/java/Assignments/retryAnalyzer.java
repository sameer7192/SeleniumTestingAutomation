package Assignments;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnalyzer implements IRetryAnalyzer {
	int counter=0;
	int retryLimit=2;
	

	@Override
	public boolean retry(ITestResult result) {
		if (counter<retryLimit) {
			counter++;
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

}
