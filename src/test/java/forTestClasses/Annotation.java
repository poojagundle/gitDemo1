package forTestClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation 
{
  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("1- beforeSuite");
  }
  @BeforeTest
  public void beforetest()
  {
	  System.out.println("2- beforeTest");
	  
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("3-beforeclass");
  }
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("4-beforemethod");
  }
  @Test
  public void test1()//testcases 
  {
	  System.out.println("5-test1");
  }
  
  @Test
  public void test2()  //for test cases
  {
	  System.out.println("5-test2");
  }
  
  
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("6-aftermethod");
  }
  
  @AfterClass
  public void afterClass()
  {
	  System.out.println("7-afterClass");
  }
  
  
  @AfterTest
  public void afterTest()
  {
	  System.out.println("8-afterTest");
  }
  
  
  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("9-afterSuite");
	  
  }
  
}
