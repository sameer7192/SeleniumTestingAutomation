package testNgPrograms;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationList {
  @BeforeSuite
  public void f1() {
	  System.out.println("f1");
  }
  @BeforeTest
  public void f2() {
	  System.out.println("F2");
  }
  @BeforeClass
  public void f3() {
	  System.out.println("F3");
  }
  @BeforeMethod
  public void f4() {
	  System.out.println("F4");
  }
  @Test
  public void f5() {
	  System.out.println("F5");
  }
  @Test
  public void f12() {
	  System.out.println("F12");
  }
  @AfterMethod
  public void f9() {
	  System.out.println("F9");
  }
  @AfterClass
  public void f8() {
	  System.out.println("F8");
  }
  @AfterTest
  public void f7() {
	  System.out.println("F7");
  }
  @AfterSuite
  public void f6() {
	  System.out.println("F6");
  }  
}
//STCM suit   test   class    method
