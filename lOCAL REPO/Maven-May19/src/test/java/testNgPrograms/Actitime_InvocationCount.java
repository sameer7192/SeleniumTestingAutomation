package testNgPrograms;

import org.testng.annotations.Test;

public class Actitime_InvocationCount {

	@Test(enabled=true,invocationCount=10)
	public void openBrowserAndAppURL() {
		System.out.println("Open browser and enter app url");
	}
}