package Assignments;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import junit.framework.Assert;
import mavenUtilities.SeleniumUtility;

public class testProgram_2 {
	@Test
	public void Test3() {
		System.out.println("test number 3");
		Assert.assertEquals(false, true);
	}
	@Test
	public void Test4() {
		System.out.println("test number 4");
		Assert.assertEquals(false, true);
	}
	
}


