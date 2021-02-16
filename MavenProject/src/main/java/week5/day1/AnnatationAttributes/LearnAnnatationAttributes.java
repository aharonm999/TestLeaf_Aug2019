package week5.day1.AnnatationAttributes;

import java.util.NoSuchElementException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnAnnatationAttributes {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation");
	}
	
	@Test(invocationCount=2)
	public void testCase1() {
		System.out.println("invocationCount: Runs for the same Test data, Cannot Pass the different Data");
	}
	
	@Test(invocationCount=2, threadPoolSize=2)
	public void testCase2() {
		System.out.println("threadPoolSize: This will not work in SE methods implementation level. becaue driver is not shared. Use in driver program it works.");
	}
	
	@Test(invocationCount=2, invocationTimeOut=30000)
	public void testCase3() {
		System.out.println("invocationTimeOut: The whole iteration will complete in given span of times ");
	}
	
	@Test(timeOut=30000) 
	public void testCase4() {
		System.out.println("timeOut: Independent time to excute the code. i.e Each iteration will allocate some time. ");
	}
	
	@Test(priority=1) 
	public void testCase5() {
		System.out.println("priority: Least one get execte first. If alphabetical-> excute in alphabetical order.");
		System.out.println("All the priorities are same in class level. but where as in XML it will execute which we have given.");
	}
	
	/*@Test(dependsOnMethods=AnnatationAttributes.LearnAnnatationAttributes.testCase6) 
	public void testCase6() {
		System.out.println("dependsOnMethods: here we give PackageName.ClassName.MethodName");
		System.out.println("All the dependents will run first/executes first. Then only executes given one");
	}*/
	
	@Test(dependsOnMethods= {"AnnatationAttributes.LearnAnnatationAttributes.testCase6"}, alwaysRun=true) 
	public void testCase7() {
		//System.out.println("alwaysRun: here we give {"PackageName.ClassName.MethodName"},after that alwaysRun);
	}
	
	@Test(expectedExceptions= {RuntimeException.class, NoSuchElementException.class}) 
	public void testCase8() {
		System.out.println("expectedExceptions: Need to tes +ve and -ve scenarios");
		System.out.println("If we are doing -ve testing and still we want to get the -ve testing report then use this.");
	}
	
	@Test(enabled=false) 
	public void testCase9() {
		System.out.println("enabled: Particular module is not ready, but still testing develops the code, but not available and need to test the code");
	}
	
	@Test(successPercentage=80) 
	public void testCase10() {
		System.out.println("successPercentage: To check the percentage of successful execution");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Annotation");
	}
	
}
