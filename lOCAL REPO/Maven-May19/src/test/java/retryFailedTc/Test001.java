package retryFailedTc;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test001 {

	@Test(retryAnalyzer = retryFailedTc.RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2()
	{
		Assert.assertEquals(true, true);
	}
}
