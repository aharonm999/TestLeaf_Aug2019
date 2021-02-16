package week5.day1.AA.TestNG.Annatations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnatationsOfTestNG {
	
	// TestNG Annotations Hierarchy with Single Test case.
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation");
	}
	
	@Test
	public void testCase() {
		System.out.println("Test Case 1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Annotation");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Annotation");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Annotation");
	}
	
}