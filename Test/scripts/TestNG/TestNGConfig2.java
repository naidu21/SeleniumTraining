package scripts.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGConfig2 {
  @Test
  public void test1() {
	  System.out.println("insider test1 of TestNGConfig2");
  }
  
  public void test2() {
	  System.out.println("insider test2 of TestNGConfig2");
  }
  
  public void test3() {
	  System.out.println("insider test3 of TestNGConfig2");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("insider beforeMethods of TestNGConfig2");
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("insider afterMethod of TestNGConfig2");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("insider beforeClass of TestNGConfig2");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("insider afterClass of TestNGConfig2");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("insider beforeTest of TestNGConfig2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("insider afterTest of TestNGConfig2");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("insider beforeSuite of TestNGConfig2");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("insider afterSuite of TestNGConfig2");
  }

}
