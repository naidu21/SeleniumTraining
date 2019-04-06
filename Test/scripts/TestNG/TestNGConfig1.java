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

public class TestNGConfig1 {
  @Test
  public void test1() {
	  
	  System.out.println("insider test1 of TestNGConfig1");
	  
  }
  
  @Test
  public void test2() {
	  System.out.println("insider test2 of TestNGConfig1");
  }
  
  @Test
  public void test3() {
	  System.out.println("insider test3 of TestNGConfig1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("insider beforeMethod of TestNGConfig1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("insider afterMethod of TestNGConfig1");
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("insider beforeClass of TestNGConfig1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("insider afterClass of TestNGConfig1");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("insider beforeTest of TestNGConfig1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("insider afterTest of TestNGConfig1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("insider beforeSuite of TestNGConfig1");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("insider afterSuite of TestNGConfig1");
  }

}
