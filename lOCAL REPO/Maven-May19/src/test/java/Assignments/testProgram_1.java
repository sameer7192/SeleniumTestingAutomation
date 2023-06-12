package Assignments;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class testProgram_1 {
  @Test (retryAnalyzer = Assignments.retryAnalyzer.class)
  public void Test1() {
	  { 
		  Assert.assertEquals(true, false);
	  }
  }
  @Test
  public void Test2() {
	  {
		  Assert.assertEquals(false, false);
	  }
  }
  
  
}
