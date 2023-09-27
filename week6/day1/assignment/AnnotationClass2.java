package week6.day1.assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationClass2 {
  @Test
  public void Test3() {
	  System.out.println("Test 3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("BeforeMethod 3");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AfterMethod 3");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass 3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass 3");
  }

}
